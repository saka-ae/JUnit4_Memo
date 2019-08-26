package chap5.じゃんけんプログラム_インタフェース;

import java.util.Random;

import chap3.じゃんけんプログラム_オブジェクト指向プログラミング.Hand;

public class RandomTactics implements Tactics {
	private static final Random _random = new Random();


	@Override
	public Hand getHand() {
		Hand[] allHands = Hand.values();
		int index = _random.nextInt(allHands.length);

		return allHands[index];
	}

}
