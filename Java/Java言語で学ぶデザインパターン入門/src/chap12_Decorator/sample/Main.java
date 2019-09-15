package chap12_Decorator.sample;

public class Main {

	public static void main(String[] args) {
		Display disp = new StringDisplay("Hello world!");
		Display decorate1 = new SideBorder(disp, '*');
		Display decorate2 = new SideBorder(decorate1, '+');

		decorate2.show();
	}

}
