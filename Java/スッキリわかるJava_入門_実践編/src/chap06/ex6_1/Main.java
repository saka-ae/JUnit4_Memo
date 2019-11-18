package chap06.ex6_1;

public class Main {

	public static void main(String[] args) {
		int num = 3;

		Func1 func1 = FuncList::isOdd;
		String oddOrEven = (func1.test(num)) ? "Odd" : "Even";
		System.out.printf("%d is %s\n", num, oddOrEven);

		boolean male = true;
		String name = "abc";

		FuncList funcList = new FuncList();
		Func2 func2 = funcList::addNamePrefix;
		String resultName = func2.applyAsString(male, name);
		System.out.println(resultName);
	}

}
