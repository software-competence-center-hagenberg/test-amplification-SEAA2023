package at.scch.test;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import com.google.common.collect.ImmutableSet;
import com.google.common.reflect.ClassPath;
import com.google.common.reflect.ClassPath.ClassInfo;

import at.scch.test.util.ReflectionUtil;

public class ClassCollector {

	private static final Logger logger = Logger.getLogger(ClassCollector.class.getName());

	public static List<Class<?>> getControlClasses(String... packageNames) throws IOException {
		if (packageNames.length < 1) {
			return Collections.emptyList();
		}

		ClassPath classPath = ClassPath.from(ClassLoader.getSystemClassLoader()); // might need to provide different
																					// ClassLoader

		ArrayList<Class<?>> controlClasses = new ArrayList<Class<?>>();
		for (String packageName : packageNames) {
			logger.info("Check package '" + packageName + "'!");

			ImmutableSet<ClassInfo> classes = classPath.getTopLevelClassesRecursive(packageName);

			append(classes, controlClasses);
		}

		return controlClasses;
	}

	private static void append(ImmutableSet<ClassInfo> classes, ArrayList<Class<?>> controlClasses) {
		for (ClassInfo classInfo : classes) {
			Class<?> clazz = classInfo.load();
			int modifiers = clazz.getModifiers();
			if (!Modifier.isAbstract(modifiers) && hasPublicConstructor(clazz) && hasNoneStaticPublicMethod(clazz)) {
				controlClasses.add(clazz);
			}
		}
	}

	private static boolean hasNoneStaticPublicMethod(Class<?> clazz) {
		return Arrays.stream(clazz.getDeclaredMethods())
				.anyMatch(m -> (ReflectionUtil.isPublic(m) && !ReflectionUtil.isStatic(m)));
	}

	private static boolean hasPublicConstructor(Class<?> clazz) {
		// ignore
		return Arrays.stream(clazz.getConstructors()).anyMatch(c -> !Modifier.isPrivate(c.getModifiers()));
	}

	public static void main(String[] args) throws IOException {
		List<Class<?>> controlClasses = ClassCollector.getControlClasses(args);

		logger.info("Found " + controlClasses.size() + " Control classes");
		for (Class<?> controlClass : controlClasses) {
			List<Method> publicMethods = filterPublicMethods(controlClass);
			logger.info(controlClass.getName() + " (" + publicMethods.size() + " public, none static methods (no inherited methods inkluded!): "
					+ getMethodNameString(publicMethods));
		}
	}

	private static List<Method> filterPublicMethods(Class<?> controlClass) {
		return Arrays.stream(controlClass.getDeclaredMethods())
				.filter(m -> ReflectionUtil.isPublic(m) && !ReflectionUtil.isStatic(m)).collect(Collectors.toList());
	}

	private static String getMethodNameString(List<Method> methodList) {

		String methodNameString = methodList.stream().map(new Function<Method, String>() {

			// get argument name
			public String apply(Method t) {
				return t.getName();
			}
		}).collect(Collectors.joining(" "));

		return methodNameString;
	}

}
