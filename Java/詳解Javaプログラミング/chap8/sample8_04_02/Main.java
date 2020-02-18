package chap8.sample8_04_02;

import chap8.sample8_04_01.ShowThread;

public class Main {

	public static void main(String[] args) {
		Thread foo = new ShowThread("Foo");
		Thread bar = new ShowThread("Bar");

		bar.setPriority(Thread.NORM_PRIORITY + 1);

		foo.start();
		bar.start();
	}

}
