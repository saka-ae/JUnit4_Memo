package chap10_Strategy.sample;

import java.util.Random;

public class RandomStrategy implements Strategy {
	private Random _random = new Random();


	@Override
	public Hand nextHand() {
		Hand[] allHands = Hand.values();
		int index = _random.nextInt(allHands.length);

		return allHands[index];
	}

}
