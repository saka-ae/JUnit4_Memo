package chap7.sample7_03;

import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {
		Method[] publicMedhods = String.class.getMethods();
		for (Method m : publicMedhods)
			System.out.println(m.getName());
	}

}
