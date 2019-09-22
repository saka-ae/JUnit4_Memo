package chap4.ex4_4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] numbers = { 3, 4, 9 };

		Scanner sc = new Scanner(System.in);

		System.out.print("1桁の数字を入力: ");
		int num = sc.nextInt();

		for (int number : numbers)
			if (num == number) {
				System.out.println("アタリ！");
				break;
			}
	}

}
