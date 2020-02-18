package chap7.sample7_03_03;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {
		String className	= "java.lang.System";
		String methodName	= "currentTimeMillis";
		Class[] methodArgTypes	= new Class[] { };

		try {
			Class c = Class.forName(className);
			Method method = c.getMethod(methodName, methodArgTypes);

			Object instance = null;
			Object[] methodArgs = null;
			Object result = method.invoke(instance, methodArgs);

			System.out.println(result);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException | IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			Throwable target = e.getTargetException();
			System.err.println(target);
		}
	}

}
