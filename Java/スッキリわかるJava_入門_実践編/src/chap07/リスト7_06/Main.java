package chap07.リスト7_06;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {

	public static void main(String[] args) throws Exception {
		Class<RefSample> clazz = RefSample.class;

		Constructor<RefSample> constructor = clazz.getConstructor(int.class);
		RefSample instance = (RefSample) constructor.newInstance(256);

		int num1 = 2;
		Field field = clazz.getField("times");
		field.set(instance, num1);
		System.out.println(field.get(instance));

		
		Method method1 = clazz.getMethod("hello", String.class);
		method1.invoke(instance, "world!");

		int num2 = 128;
		Method method2 = clazz.getMethod("hello", String.class, int.class);
		method2.invoke(instance, "world!", num2);

		
		int modifiers1 = clazz.getModifiers();
		System.out.printf("%s is public?	: %b\n",clazz.getSimpleName(), Modifier.isPublic(modifiers1));

		int modifiers2 = method2.getModifiers();
		System.out.printf("%s() is final?		: %b\n",method2.getName(), Modifier.isFinal(modifiers2));

	}

}
