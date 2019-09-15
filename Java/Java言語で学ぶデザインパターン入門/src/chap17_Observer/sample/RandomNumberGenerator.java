package chap17_Observer.sample;

import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator {
	private static final int MAX	= 10;
	private static final int TIMES	= 3;

	private Random _random = new Random();


	@Override
	public void execute() {
		for (int i=0; i < TIMES; i++) {
			int randomNumber = _random.nextInt(MAX + 1);
			super.setNumber(randomNumber);

			super.notifyObservers();
		}
	}
}
