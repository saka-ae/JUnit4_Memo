package chap3.リスト3_04_冗長でスッキリしないソースコード;

import java.util.Random;

public class Main {
	private static final int UPPER = 2;

	public static void main(String[] args) {
		System.out.println("あなたの運勢を占います");

		Random random = new Random();
		int fortune = random.nextInt(UPPER + 1);

		if (fortune == 0)
			System.out.println("大吉");
		else if (fortune == 1)
			System.out.println("中吉");
		else
			System.out.println("小吉");
	}

}
