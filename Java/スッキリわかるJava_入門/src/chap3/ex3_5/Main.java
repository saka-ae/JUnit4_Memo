package chap3.ex3_5;

import java.util.Scanner;

public class Main {
	private static final int SEARCH	= 1;
	private static final int ADD	= 2;
	private static final int DELETE	= 3;
	private static final int CHANGE	= 4;


	public static void main(String[] args) {
		System.out.print("[メニュー] 1:検索 2:登録 3:削除 4:変更 >");

		Scanner sc = new Scanner(System.in);
		int selected = sc.nextInt();

		switch (selected) {
			case SEARCH:
				System.out.println("検索します");
				break;
			case ADD:
				System.out.println("登録します");
				break;
			case DELETE:
				System.out.println("削除します");
				break;
			case CHANGE:
				System.out.println("変更します");
				break;
		}
	}

}
