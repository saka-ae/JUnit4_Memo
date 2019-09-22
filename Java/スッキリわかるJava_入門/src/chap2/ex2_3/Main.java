package chap2.ex2_3;

import java.util.Random;
import java.util.Scanner;

public class Main {

	private static final int MAX = 3;


	public static void main(String[] args) {
		System.out.println("ようこそ占いの館へ");

		System.out.println("あなたの名前を入力してください");
		System.out.print("Name: ");
		Scanner	sc		= new Scanner(System.in);
		String	name	= sc.next();

		System.out.println("あなたの年齢を入力してください");
		System.out.print("Age: ");
		String	ageString	= sc.next();
		int		age			= Integer.parseInt(ageString);

		Random	random		= new Random();
		int		fortune	= random.nextInt(MAX + 1);
		fortune++;

		System.out.println("占いの結果が出ました！");
		System.out.format("%d歳の%sさん、あなたの運気番号は%dです", age, name, fortune);

		System.out.println("1:大吉 2:中吉 3:小吉 4:凶");
	}
}
