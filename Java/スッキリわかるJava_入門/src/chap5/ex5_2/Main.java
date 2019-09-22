package chap5.ex5_2;

public class Main {

	public static void main(String[] args) {
		String title	= "program";
		String address	= "programing@c.com";
		String text		= "Hello world!";
		
		
		email(title, address, text);
	}


	private static void email(String title, String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名: " + title);
		System.out.println("本文: " + text);
	}

}
