package chap3.ex3_6;

import java.util.Random;
import java.util.Scanner;

public class Main {
	private static final int MAX	= 9;
	private static final int TIMES	= 3;


	public static void main(String[] args) {
		System.out.println("【数あてゲーム】");

		Random random = new Random();
		int ans = random.nextInt(MAX + 1);

		Scanner sc = new Scanner(System.in);

		for (int i=0; i < TIMES; i++) {
			System.out.print("0～9の数字を入力してください >");

			int num = sc.nextInt();

			if(num == ans) {
				System.out.println("アタリ！");
				break;
			} else
				System.out.println("違います。");
		}

		System.out.format("正解は%dでした。", ans);
		System.out.println("ゲームを終了します");
	}

}
