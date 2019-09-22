package chap2.リスト2_14_ランダムな数を生成する命令;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random random = new Random();

		int randomNumber = random.nextInt(100);

		System.out.println(randomNumber);
	}
}
