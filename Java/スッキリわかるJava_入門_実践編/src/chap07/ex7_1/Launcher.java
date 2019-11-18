package chap07.ex7_1;

import java.lang.reflect.Method;

public class Launcher {

	private static final int OK		= 0;
	private static final int ERROR	= 1;

	private static final String プロセス			= "E";
	private static final String リフレクション	= "I";


	public static void main(String[] args) {
		showMemory();

		String fqcn = args[0];
		Class<?> clazz = getClass(fqcn);
		showMethods(clazz);

		String launcherType = args[1];
		if (launcherType.equals(プロセス)) {
			launchProcess(fqcn);
		} else if (launcherType.equals(リフレクション)) {
			launchReflection(clazz);
		} else {
			treatIllegatArgument();
		}

		showMemory();

		System.exit(OK);
	}

	private static void showMemory() {
		Runtime runtime = Runtime.getRuntime();

		long usingMemory_mb = (runtime.totalMemory() - runtime.freeMemory()) / 1024 / 1024;

		System.out.println("使用中のメモリ（MB）: " + usingMemory_mb);
	}

	private static Class<?> getClass(String fqcn) {
		Class<?> clazz = null;

		try {
			clazz = Class.forName(fqcn);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();

			System.exit(ERROR);
		}

		return clazz;
	}

	private static void showMethods(Class<?> clazz) {
		Method[] methods = clazz.getDeclaredMethods();

		for (Method method : methods)
			System.out.println(method);
	}

	private static void launchProcess(String fqcn) {
		String java			= "C:/Program Files/Java/jdk-12.0.1/bin/java.exe";
		String dir			= "bin/chap07/";
		String className	= dir + fqcn;

		try {
			ProcessBuilder pb = new ProcessBuilder(java, className);
			Process process = pb.start();

			process.waitFor();
		} catch (Exception e) {
			exitProgram(e);
		}
	}

	private static void launchReflection(Class<?> clazz) {
		String methodName = "main";
		Class<?> argType = String[].class;

		try {
			Method main = clazz.getMethod(methodName, argType);

			Object instance = null;
			Object[] args = new Object[] { new String[] { } };
			main.invoke(instance, args);
		} catch (Exception e) {
			exitProgram(e);
		}
	}

	private static void treatIllegatArgument() {
		try {
			throw new IllegalArgumentException();
		} catch (Exception e) {
			exitProgram(e);
		}
	}

	private static void exitProgram(Exception e) {
		e.printStackTrace();
		System.exit(ERROR);
	}

}
