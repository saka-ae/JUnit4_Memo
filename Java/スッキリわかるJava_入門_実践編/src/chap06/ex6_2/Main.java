package chap06.ex6_2;

import chap06.ex6_1.Func1;
import chap06.ex6_1.Func2;

public class Main {

	public static void main(String[] args) {
		int num = 3;

		Func1 func1 = n -> (n % 2) == 1;
		String oddOrEven = (func1.test(num)) ? "Odd" : "Even";
		System.out.printf("%d is %s\n", num, oddOrEven);

		boolean isMale = true;
		String personName = "abc";

		Func2 func2 = (male, name) -> {
			String prefix = (male) ? "Mr." : "Ms.";

			return  prefix + name;
		};
		String resultName = func2.applyAsString(isMale, personName);
		System.out.println(resultName);
	}

}
