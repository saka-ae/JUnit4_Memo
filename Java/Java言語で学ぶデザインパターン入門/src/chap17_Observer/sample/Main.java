package chap17_Observer.sample;

public class Main {

	public static void main(String[] args) {
		NumberGenerator generator = new RandomNumberGenerator();

		Observer digitObserver = new DigitObserver();
		Observer graphObserver = new GraphObserver();

		generator.addObserver(digitObserver);
		generator.addObserver(graphObserver);

		generator.execute();
	}

}
