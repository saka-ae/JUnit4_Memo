package chap20_Flyweight.ex20_1;

import java.util.Random;

public class Main {
	private static final int UPPER = 100;


	public static void main(String[] args) {
		Random random = new Random();
		int num = random.nextInt(UPPER + 1);
		System.out.println(num);

		String numStr = String.valueOf(num);
		JapaneseNumberString jns = new JapaneseNumberString(numStr, false);
		jns.print();
	}

}
