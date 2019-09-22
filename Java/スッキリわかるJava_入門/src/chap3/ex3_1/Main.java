package chap3.ex3_1;

public class Main {
	private static final int NUMBER	= 60;
	private static final Object NAME	= "湊";


	public static void main(String[] args) {
		int weight = 60;
		if (weight == NUMBER)
			System.out.format("%d = %d\n", weight, NUMBER);

		int num1	= 1;
		int num2	= 100;
		int answer	= (num1 + num2) * 2;
		if (answer > NUMBER)
			System.out.format("(%d + %d) * 2 > %d\n", num1, num2, NUMBER);

		int num3 = 3;
		if ((num3 % 2) == 1)
			System.out.println(num3 + " is odd");

		String name = "湊";
		if (name.equals(NAME))
			System.out.format("%s is %s\n", name, NAME);
	}

}
