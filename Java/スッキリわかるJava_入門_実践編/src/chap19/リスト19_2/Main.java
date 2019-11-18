package chap19.リスト19_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.print("入力: ");
		
		Thread t = new PrintingThread();
		t.start();

		new Scanner(System.in).next();
	}

}
