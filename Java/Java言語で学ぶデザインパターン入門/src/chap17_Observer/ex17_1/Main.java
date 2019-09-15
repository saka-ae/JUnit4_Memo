package chap17_Observer.ex17_1;

import chap17_Observer.sample.DigitObserver;
import chap17_Observer.sample.GraphObserver;
import chap17_Observer.sample.NumberGenerator;
import chap17_Observer.sample.Observer;

public class Main {

	public static void main(String[] args) {
		NumberGenerator generator = new IncrementalNumberGenerator(10, 50, 5);

		Observer digitObserver = new DigitObserver();
		Observer graphObserver = new GraphObserver();

		generator.addObserver(digitObserver);
		generator.addObserver(graphObserver);

		generator.execute();
	}

}
