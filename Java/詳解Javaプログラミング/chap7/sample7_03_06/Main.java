package chap7.sample7_03_06;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Main {

	public static void main(String[] args) {
		InvocationHandler handler = new InvocationHandler() {

			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				if (method.getName().equals("greet"))
					System.out.println("Hello world!");

				return null;
			}

		};

		Class<?> cls = MyInterface.class;

		ClassLoader loader = cls.getClassLoader();
		Class<?>[] argTypes = new Class<?>[] { cls };

		MyInterface proxy = (MyInterface) Proxy.newProxyInstance(loader, argTypes, handler);
		proxy.greet();
	}

}
