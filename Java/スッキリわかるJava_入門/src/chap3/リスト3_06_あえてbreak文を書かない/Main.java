package chap3.リスト3_06_あえてbreak文を書かない;

import java.util.Random;

public class Main {
	private static final int UPPER = 3;

	public static void main(String[] args) {
		System.out.println("あなたの運勢を占います");

		Random random = new Random();
		int fortune = random.nextInt(UPPER + 1);

		switch (fortune) {
			case 0:
			case 1:
				System.out.println("大吉");
				break;
			case 2:
				System.out.println("中吉");
				break;
			default:
				System.out.println("小吉");
		}
	}

}
