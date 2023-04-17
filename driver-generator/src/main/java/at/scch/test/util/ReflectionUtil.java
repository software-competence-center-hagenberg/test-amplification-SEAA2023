package at.scch.test.util;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;

public class ReflectionUtil {

	public enum TypeStringKind {
		MethodDefined, ReturnType, ParameterType
	}

	public static String getConstructorParameterDeclaration(Constructor<?> constructor) {
		Writer writer = new StringWriter();
		try {
			boolean isGenericMethod = constructor.getTypeParameters().length > 0;
			writer.write("(");
			printParameters(constructor, ", ", isGenericMethod, writer);
			writer.write(")");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return writer.toString();
	}

	public static String getConstructorDeclaration(Constructor<?> constructor) {
		Writer writer = new StringWriter();
		try {
			printConstructor(constructor, writer);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return writer.toString();
	}

	public static String getMethodDeclaration(Method method) {
		Writer writer = new StringWriter();
		try {
			printMethod(method, writer);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return writer.toString();
	}

	public static boolean isPublic(Method method) {
		return Modifier.isPublic(method.getModifiers());
	}

	public static boolean isStatic(Method method) {
		return Modifier.isStatic(method.getModifiers());
	}

	public static boolean isVoid(Method method) {
		return method.getReturnType().equals(Void.TYPE);
	}

	public static boolean isDeprecated(Method method) {
		return method.getAnnotation(Deprecated.class) != null;
	}
	
	public static boolean isAbstract(Method method) {
		return Modifier.isAbstract(method.getModifiers());
	}

	public static boolean isGetter(Method method) {
		if (Modifier.isPublic(method.getModifiers()) &&
				method.getParameterTypes().length == 0) {
			if (method.getName().matches("^get[A-Z].*") &&
					!method.getReturnType().equals(void.class))
				return true;
			if (method.getName().matches("^is[A-Z].*") &&
					method.getReturnType().equals(boolean.class))
				return true;
		}
		return false;
	}

	public static boolean isSetter(Method method) {
		return Modifier.isPublic(method.getModifiers()) &&
				method.getReturnType().equals(void.class) &&
				method.getParameterTypes().length == 1 &&
				method.getName().matches("^set[A-Z].*");
	}

	private static void printConstructor(Constructor<?> c, Writer writer) throws IOException {
		printExecutable(c, writer);
	}

	private static void printMethod(Method m, Writer writer) throws IOException {
		printExecutable(m, writer);
	}

	private static void printExecutable(Executable e, Writer writer) throws IOException {
		String name = e.getName();
		// remove "transient" modifier (which is wrong for methods)
		// see http://stackoverflow.com/questions/4936803/why-java-methods-with-varargs-identified-as-transient
		String modifierString = Modifier.toString(e.getModifiers()).replace("transient", "");
		writer.write(modifierString);
		writer.write(" ");

		boolean isGenericMethod = e.getTypeParameters().length > 0;
		if (isGenericMethod) {
			printTypes(e.getTypeParameters(), "<", ", ", "> ", TypeStringKind.MethodDefined, isGenericMethod, writer);
		}

		if(e instanceof Method) {
			printType(((Method)e).getGenericReturnType(), TypeStringKind.ReturnType, isGenericMethod, writer);
		}
		writer.write(" ");
		writer.write(name);
		writer.write("(");

		printParameters(e, ", ", isGenericMethod, writer);
		writer.write(")");

		// no generic support for now
		printThrowsDeclaration(e.getExceptionTypes(), writer);

	}
	
	private static void printThrowsDeclaration(Class<?>[] exceptionTypes, Writer writer) throws IOException {
		if (exceptionTypes.length == 0) {
			return;
		}

		writer.write(" ");
		writer.write("throws");

		boolean first = true;
		for (Class<?> exceptionType : exceptionTypes) {
			if (!first) {
				writer.write(";");
				first = false;
			}
			writer.write(" ");
			writer.write(exceptionType.getCanonicalName());
		}
	}

	private static void printParameters(Executable e, String sep, boolean isGenericMethod, Writer writer)
			throws IOException {
		Parameter[] parameters = e.getParameters();

		for (int i = 0; i < parameters.length; i++) {
			Parameter parameter = parameters[i];
			// parameter separator
			if (i > 0)
				writer.write(sep);

			Type parameterizedType = parameter.getParameterizedType();
			String parameterName = parameter.getName();

			printType(parameterizedType, TypeStringKind.ParameterType, isGenericMethod, writer);
			writer.write(" ");
			writer.write(parameterName);
		}
	}

	public static void printTypes(Type[] types, String pre, String sep, String suf, TypeStringKind typeStringKind,
			boolean isGenericMethod, Writer writer) throws IOException {

		if (types.length == 0) {
			return;
		}
		if (pre.equals(" extends ") && Arrays.equals(types, new Type[] { Object.class }))
			return;

		writer.write(pre);
		for (int i = 0; i < types.length; i++) {
			if (i > 0)
				writer.write(sep);
			printType(types[i], typeStringKind, isGenericMethod, writer);
		}
		writer.write(suf);
	}

	public static void printType(Type type, TypeStringKind typeStringKind, boolean isGenericMethod, Writer writer)
			throws IOException {
		if (type instanceof Class) {
			Class<?> t = (Class<?>) type;
			writer.write(t.getCanonicalName());
		} else if (type instanceof TypeVariable) {
			TypeVariable<?> t = (TypeVariable<?>) type;

			switch (typeStringKind) {
				case MethodDefined:
					writer.write(t.getName());
					printTypes(t.getBounds(), " extends ", " & ", "", typeStringKind, isGenericMethod, writer);
					break;
				default:
					if (!isGenericMethod) {
						// use concrete String type instead variable type name instead
						writer.write("String");
					} else {
						// we assume type is defined at method level
						writer.write(t.getName());
					}
			}

		} else if (type instanceof WildcardType) {
			WildcardType t = (WildcardType) type;
			writer.write("?");
			printTypes(t.getUpperBounds(), " extends ", " & ", "", typeStringKind, isGenericMethod, writer);
			printTypes(t.getLowerBounds(), " super ", " & ", "", typeStringKind, isGenericMethod, writer);
		} else if (type instanceof ParameterizedType) {
			ParameterizedType t = (ParameterizedType) type;
			printType(t.getRawType(), typeStringKind, isGenericMethod, writer);
			printTypes(t.getActualTypeArguments(), "<", ", ", ">", typeStringKind, isGenericMethod, writer);
		} else if (type instanceof GenericArrayType) {
			GenericArrayType t = (GenericArrayType) type;
			writer.write("");
			printType(t.getGenericComponentType(), typeStringKind, isGenericMethod, writer);
			writer.write("[]");
		}

	}

}
