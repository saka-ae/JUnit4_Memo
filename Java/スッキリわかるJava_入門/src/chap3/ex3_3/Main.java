package chap3.ex3_3;

import static chap3.ex3_3.Gender.*;

public class Main {

	public static void main(String[] args) {
		Gender	gender	= MAN;
		int		age		= 100;


		System.out.println("こんにちは。");

		if(gender == MAN) {
			System.out.println("私は男です。");
			System.out.format("私は%d歳です\n", age);
		}
		else
			System.out.println("私は女です。");

		System.out.println("よろしくお願いします。");
	}

}
