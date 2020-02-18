package chap8.sample8_04_03;

public class Main {

	public static void main(String[] args) {
		Thread foo = new ShowThread("Foo");
		Thread bar = new ShowThread("Bar");

		foo.start();
		bar.start();
	}

}
