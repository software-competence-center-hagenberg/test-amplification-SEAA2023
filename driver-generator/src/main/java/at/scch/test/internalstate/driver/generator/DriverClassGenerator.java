package at.scch.test.internalstate.driver.generator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Writer;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.MissingFormatArgumentException;
import java.util.Properties;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import org.apache.commons.lang3.ClassUtils;
import org.rythmengine.Rythm;

import com.fasterxml.classmate.MemberResolver;
import com.fasterxml.classmate.ResolvedType;
import com.fasterxml.classmate.ResolvedTypeWithMembers;
import com.fasterxml.classmate.TypeResolver;
import com.fasterxml.classmate.members.RawConstructor;
import com.fasterxml.classmate.members.ResolvedMethod;
import com.google.common.reflect.TypeToken;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import at.scch.test.util.ReflectionUtil;

public class DriverClassGenerator {

	private static final Logger logger = Logger.getLogger(DriverClassGenerator.class.getName());
	private static String templateString = null;
	private static final boolean IGNORE_INHERITED = false;

	public static void main(String[] args) {

		// add option for specifying file as first argument, ignoring all others
		if (args[0].contains("-csv=")) {

			String filename = args[0].substring(args[0].indexOf('=') + 1);
			logger.log(Level.FINE, "Filename is " + filename);

			// generate with given input from file
			DriverClassGenerator.generate(read(filename));

		} else {
			throw new MissingFormatArgumentException("CSV-File argument missing (-csv)");
		}
	}

	public static String getDelegationConstructorParameterDeclaration(Constructor<?> constructor) {
		String constructorParameterDeclaration = ReflectionUtil.getConstructorParameterDeclaration(constructor);
	
		return constructorParameterDeclaration;
	}
	
	public static String getConstructorParameterNameString(Constructor<?> constructor) {
		return getParameterNameString(constructor);
	}	

	public static String getDelegationMethodDeclaration(Method method) {
		// get method declaration of given method
		String methodDeclaration = ReflectionUtil.getMethodDeclaration(method);
	
		Class<?> declaringClass = method.getDeclaringClass();
		String methodName = method.getName();
		// rename Object methods
		if (declaringClass == Object.class) {
			methodDeclaration = methodDeclaration.replace(methodName + "(", methodName + "_CUT(");
		}
		// rename methods which would break contract if call is delegated internally
		if(methodName.equals("equals")||methodName.equals("hashCode")||methodName.equals("toString")) {
			methodDeclaration = methodDeclaration.replace(methodName + "(", methodName + "_CUT(");
		}
		// delegation methods have to remove "native" modifier
		// delegation methods have to remove "final" modifier to allow overwriting
		// methods
		return methodDeclaration.replace("native ", "").replace("final ", "").replace("volatile", "")
				.replace("static", "").replace("abstract", "").replaceAll(" +", " ");
	}

	public static String getDelegationMethodBody(Method method, String className, int spaceNumber) {
		String returnString = "return ";
		if (ReflectionUtil.isVoid(method)) {
			returnString = "";
		}
	
		String parameterNameString = getParameterNameString(method);
	
		String indent = "";
		for (int i = 1; i <= spaceNumber; i++) {
			indent += " ";
		}
	
		StringBuilder builder = new StringBuilder();
		String variableIndent = "";
		variableIndent = "        ";
	
		if (ReflectionUtil.isStatic(method)) {
			builder.append(indent + variableIndent + returnString + className + "." + method.getName() + "("
					+ parameterNameString + ");\n");
		} else {
			builder.append(indent + variableIndent + returnString + "getClassUnderTest()." + method.getName() + "("
					+ parameterNameString + ");\n");
		}
	
		return builder.toString();
	}

	private static String getParameterNameString(Executable executable) {
		List<Parameter> parameterList = Arrays.asList(executable.getParameters());
	
		String parameterNameString = parameterList.stream().map(new Function<Parameter, String>() {
	
			// get argument name
			public String apply(Parameter t) {
				return t.getName();
			}
		}).collect(Collectors.joining(","));
		
		return parameterNameString;
	}

	public static String getParameterAsString(Executable executable) {
		List<String> parameterAsStringList = Arrays.asList(executable.getParameters()).stream().map(parameter -> {
			Class<?> type = parameter.getType();
			String parameterAsString;
			if (type.isPrimitive()) {
				type = ClassUtils.primitiveToWrapper(type);
				parameterAsString = type.getCanonicalName() + ".toString(" + parameter.getName() + ")";
			} else {
				parameterAsString = parameter.getName() + ".toString()";
			}
			return parameterAsString;
		}).collect(Collectors.toList());
		if (parameterAsStringList.size() == 0) {
			return "";
		}
		return String.join(",", parameterAsStringList);
	}

	public static List<String> getInternalStateString(List<Method> internalStateMethodList) {
		ArrayList<String> stateItemList = new ArrayList<>();
		for (Method method : internalStateMethodList) {
			// boolean hasPrimitiveReturnType = method.getReturnType().isPrimitive();
			Class<?> returnType = method.getReturnType();
	
			if (returnType.isPrimitive()) {
				returnType = ClassUtils.primitiveToWrapper(returnType);
				stateItemList.add(
						returnType.getCanonicalName() + ".toString(getClassUnderTest()." + method.getName() + "())");
			} else if (method.getName().equals("toString")) {
				stateItemList.add("getClassUnderTest().toString()");
			} else {
				stateItemList.add("getClassUnderTest()." + method.getName() + "().toString()");
			}
		}
	
		return stateItemList;
	}

	private static List<DriverClassGeneratorInput> read(String filename) {
		List<DriverClassGeneratorInput> input = new LinkedList<>();
		String[] line;
	
		try (CSVReader csv = new CSVReader(
				new InputStreamReader(DriverClassGenerator.class.getResourceAsStream("/" + filename)))) {
	
			while ((line = csv.readNext()) != null) {
				String className = line[0];
				Class<?> loadedClass = loadClass(className);
	
				DriverClassGeneratorInput driverClassGeneratorInput = new DriverClassGeneratorInput(loadedClass);
				driverClassGeneratorInput.getConstructors().addAll(getFilteredConstructorList(loadedClass));
				driverClassGeneratorInput.getPublicMethods().addAll(getFilteredMethodList(loadedClass, line[1].split(" ")));
				//read in optional internal state methods
				if (line.length > 2) {
					driverClassGeneratorInput.getInternalStateMethods().addAll(getFilteredMethodList(loadedClass, line[2].split(" ")));
				}
				
				input.add(driverClassGeneratorInput);
			}
		} catch (IOException | CsvValidationException e) {
			logger.log(Level.SEVERE, "Could not read input " + filename, e);
		} 
		
		return input;
	}

	private static Class<?> loadClass(String className) {
		try {
			return ClassLoader.getSystemClassLoader().loadClass(className);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	
		return null;
	}

	private static Collection<? extends Constructor<?>> getFilteredConstructorList(Class<?> loadedClass) {
		List<Constructor<?>> classConstructors = getResolvedConstructorsOfClass(loadedClass);
		
		//filter for public constructors
		return classConstructors.stream()
				.filter(c -> Modifier.isPublic(c.getModifiers()) )
				.collect(Collectors.toList());
	}

	private static Collection<? extends Method> getFilteredMethodList(Class<?> loadedClass, String[] methodNames) {
		List<String> nameList = new ArrayList<>();
		
		//handle special emtpy string case
		if(methodNames[0].length()>0) {
			nameList = Arrays.asList(methodNames);
		}
		
		List<Method> classMethods = getResolvedMethodsOfClass(loadedClass);
		
		List<String> methodNameList = nameList;
		return classMethods.stream()
				.filter(cm -> Modifier.isPublic(cm.getModifiers()) && !cm.getName().equals("hashCode") && !cm.getName().equals("toString") && (methodNameList.isEmpty() || methodNameList.contains(cm.getName())))
				.collect(Collectors.toList());
	}

	private static List<Constructor<?>> getResolvedConstructorsOfClass(Class<?> c) {
		TypeResolver typeResolver = new TypeResolver();
		ResolvedType type = typeResolver.resolve(c);
		List<RawConstructor> constructors = type.getConstructors();
		
		// consider only resolved (generics) constructors of given class - get rid of
		// inherited once
		return constructors.stream()
				.filter(rc -> rc.getDeclaringType().getTypeName().equals(c.getName())).map(rc -> rc.getRawMember())
				.collect(Collectors.toList());
		
	}

	private static List<Method> getResolvedMethodsOfClass(Class<?> c) {
		TypeResolver typeResolver = new TypeResolver();
		MemberResolver memberResolver = new MemberResolver(typeResolver);
	
		ResolvedType type = typeResolver.resolve(c);
		ResolvedTypeWithMembers members = memberResolver.resolve(type, null, null);
		ResolvedMethod[] classMethods = members.getMemberMethods();
	
		// consider only resolved (generics) methods of given class - get rid of
		// inherited methods
		return Arrays.asList(classMethods).stream()
				.filter(cm -> IGNORE_INHERITED ? cm.getDeclaringType().getTypeName().equals(c.getName()):true).map(cm -> cm.getRawMember())
				.collect(Collectors.toList());
	}

	private static void generate(List<DriverClassGeneratorInput> input) {
		configureRythm("TestDriver");
		
		for (DriverClassGeneratorInput driverClassGeneratorInput : input) {
			createFacade(driverClassGeneratorInput.getInputClass(), driverClassGeneratorInput.getConstructors(),  driverClassGeneratorInput.getPublicMethods(), driverClassGeneratorInput.getInternalStateMethods());
		}
	
	}

	private static void configureRythm(String name) {
		// configure template engine
		try {
			Rythm.init(getProperties());
		} catch (IOException e) {
			logger.log(Level.SEVERE, "Could not load template engine properties - generation aborted!", e);
			return;
		}
	
		try {
			templateString = getTemplateString(name);
	
		} catch (IOException e) {
			logger.log(Level.SEVERE, "Could not load adapter template - generation aborted!", e);
		}
	
		if (templateString == null) {
			return;
		}
	}

	private static Map<String, ?> getProperties() throws IOException {
		InputStream resourceAsStream = DriverClassGenerator.class.getResourceAsStream("/generator/rythm.conf");
		Properties properties = new Properties();
		properties.load(resourceAsStream);
	
		@SuppressWarnings({ "unchecked", "rawtypes" })
		Map<String, String> map = new HashMap<String, String>((Map) properties);
		return map;
	}

	private static String getTemplateString(String name) throws IOException {
		InputStream templateFileInputStream = DriverClassGenerator.class
				.getResourceAsStream("/generator/" + name + ".template");
		return IOUtils.toString(templateFileInputStream);
	}

	private static void createFacade(Class<?> controlClass, List<Constructor<?>> constructorList, List<Method> methodList, List<Method> internalStateMethodList) {
		if (methodList.isEmpty()) {
			logger.log(Level.INFO,
					"No methods to publish - skipped facade creation for class " + controlClass.getName() + "!");
			return;
		}
	
		String packageName = controlClass.getPackage().getName();
		String className = controlClass.getSimpleName();
	
		String classTypeForTesting = getClassTypeForTesting(controlClass);
	
		String output = Rythm.render(templateString, packageName, className, classTypeForTesting, constructorList, methodList, internalStateMethodList);
		File adapterFile = new File(System.getProperty("outputdir", "driver_generated"),
				controlClass.getName().replace(".", "/") + "TestDriver.java");
		Writer fileWriter = null;
		try {
			// ensure parent directories
			adapterFile.getParentFile().mkdirs();
			fileWriter = new FileWriter(adapterFile);
			// fileWriter = new OutputStreamWriter(System.out);
			fileWriter.write(output);
		} catch (IOException e) {
			logger.log(Level.WARNING, "Could not write adapter for " + adapterFile.getName() + "!", e);
		} finally {
			if (fileWriter != null) {
				try {
					fileWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private static String getClassTypeForTesting(Class<?> controlClass) {
		TypeVariable<?>[] typeParameters = controlClass.getTypeParameters();
		if (typeParameters.length == 0) {
			return "";
		}

		StringBuilder classTypeForNameBuilder = new StringBuilder();
		classTypeForNameBuilder.append("<");
		String sep = ", ";
		for (@SuppressWarnings("unused")
		TypeVariable<?> typeVariable : typeParameters) {
			// classTypeForNameBuilder.append(typeVariable.getName()).append(sep);

			// for testing we simply assume "String"
			classTypeForNameBuilder.append("String").append(sep);
		}
		int lastSeperatorIndex = classTypeForNameBuilder.lastIndexOf(sep);
		classTypeForNameBuilder.delete(lastSeperatorIndex, classTypeForNameBuilder.length());
		classTypeForNameBuilder.append(">");

		return classTypeForNameBuilder.toString();
	}

	@SuppressWarnings("unused")
	private static void debugMethod(Method method) {
		logger.fine("Filter method: " + method.getName());
		logger.fine("Method Declaration" + ReflectionUtil.getMethodDeclaration(method));

		List<Parameter> parameterList = Arrays.asList(method.getParameters());

		TypeToken<?> typeToken = TypeToken.of(method.getGenericReturnType());
		// final TypeToken<?> typeToken = new TypeToken(method.getReturnType()) {};
		final Type type = typeToken.getType(); // or getRawType() to return Class<? super T>
		logger.fine("Type: " + type);

		Type genericReturnType = method.getGenericReturnType();
		if (genericReturnType != null) {
			logger.fine("Return Type Name: " + genericReturnType.getTypeName());
		} else {
			logger.fine("NULLLLLLLL");
		}

		for (Parameter parameter : parameterList) {
			Type parameterizedType = parameter.getParameterizedType();
			if (parameterizedType != null) {
				logger.fine("Parameterized Type Name: " + parameterizedType.getTypeName());
			}
		}
	}

	private static class IOUtils {

		public static String toString(InputStream in) throws IOException {
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			StringBuilder out = new StringBuilder();
			String line;
			while ((line = reader.readLine()) != null) {
				out.append(line);
				out.append("\n");
			}
			reader.close();

			return out.toString();
		}
	}
}
