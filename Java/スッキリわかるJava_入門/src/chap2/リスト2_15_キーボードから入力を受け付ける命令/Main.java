package chap2.リスト2_15_キーボードから入力を受け付ける命令;

import java.io.InputStream;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		InputStream	stdin		= System.in;
		Scanner		scanner	= new Scanner(stdin);

		System.out.print("str: ");
		String str = scanner.next();
		System.out.println(str);

		System.out.print("num: ");
		int num = scanner.nextInt();
		System.out.println(num);
	}
}
