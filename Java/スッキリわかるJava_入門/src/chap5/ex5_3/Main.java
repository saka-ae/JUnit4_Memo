package chap5.ex5_3;

public class Main {

	public static void main(String[] args) {
		String address	= "programing@c.com";
		String text		= "Hello world!";


		email(address, text);
	}


	private static void email(String title, String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名: " + title);
		System.out.println("本文: " + text);
	}

	private static void email(String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名: 無題");
		System.out.println("本文: " + text);
	}

}
