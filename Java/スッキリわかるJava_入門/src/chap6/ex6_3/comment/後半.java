package chap6.ex6_3.comment;

import chap6.ex6_1.comment.前半;

public class 後半 {

	private static final int WAIT_MS = 3000;


	public static void call手下() {
		System.out.println("手下を呼ぶ。");
	}

	public static void show印籠() {
		System.out.println("印籠を見せる。");

		try {
			Thread.sleep(WAIT_MS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		前半.do咎め();
	}

}
