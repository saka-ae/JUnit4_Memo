package chap06.ex6_1;

public class FuncList {

	public static boolean isOdd(int x) {
		return (x % 2) == 1;
	}

	public String addNamePrefix(boolean male, String name) {
		String prefix = (male) ? "Mr." : "Ms.";

		return prefix + name;
	}

}
