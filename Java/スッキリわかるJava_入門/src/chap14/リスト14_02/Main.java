package chap14.リスト14_02;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		
		System.out.println(now.getTime());

		Date past = new Date(1_316_622_225_935L);
		System.out.println(past);
	}

}
