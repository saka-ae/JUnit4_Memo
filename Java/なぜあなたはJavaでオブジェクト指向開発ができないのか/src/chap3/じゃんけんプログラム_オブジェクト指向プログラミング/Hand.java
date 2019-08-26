package chap3.じゃんけんプログラム_オブジェクト指向プログラミング;

import java.util.Random;

public enum Hand {
	グー, チョキ, パー;


	private static final Random random = new Random();


	public static Hand getRandomHand() {
		Hand[] allHands = Hand.values();
		int index = random.nextInt(allHands.length);

		return allHands[index];
	}

}
