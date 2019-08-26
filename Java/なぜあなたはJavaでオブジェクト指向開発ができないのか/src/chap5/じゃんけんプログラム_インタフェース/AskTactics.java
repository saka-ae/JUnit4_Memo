package chap5.じゃんけんプログラム_インタフェース;

import java.util.Scanner;

import chap3.じゃんけんプログラム_オブジェクト指向プログラミング.Hand;

public class AskTactics implements Tactics {
	private final Scanner scanner_ = new Scanner(System.in);


	@Override
	public Hand getHand() {
		System.out.println();
		System.out.println("じゃんけんの手を入力してください。");

		Hand[] allHands = Hand.values();
		for (int i=0; i < allHands.length; i++)
			System.out.format("%d: %s\n", i, allHands[i]);

		final String prompt = ": ";
		final String errorMessage = "入力が正しくありません。再度入力してください。";
		for ( ; ; ) {
			System.out.print(prompt);

			int index = scanner_.nextInt();

			if (withinRange(allHands, index)) {
				System.out.println();

				return allHands[index];
			} else
				System.out.println(errorMessage);
		}
	}
	private boolean withinRange(Hand[] array, int index) {
		return index >= 0 && index < array.length;
	}

}
