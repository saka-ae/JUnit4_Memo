package chap17_Observer.ex17_2;

import chap17_Observer.ex17_1.IncrementalNumberGenerator;
import chap17_Observer.sample.DigitObserver;
import chap17_Observer.sample.NumberGenerator;
import chap17_Observer.sample.Observer;

public class Main {

	public static void main(String[] args) {
		NumberGenerator generator = new IncrementalNumberGenerator(0, 30, 1);

		Observer digitObserver	= new DigitObserver();
		Observer alphabetObserver	= new AlphabetObserver();

		generator.addObserver(digitObserver);
		generator.addObserver(alphabetObserver);

		generator.execute();
	}

}
