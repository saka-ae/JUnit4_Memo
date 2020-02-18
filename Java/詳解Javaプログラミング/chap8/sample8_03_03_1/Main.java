package chap8.sample8_03_03_1;

public class Main {

	public static void main(String[] args) {
		Producer producer = new Producer();
		Consumer consumer = new Consumer(producer);

		new Thread(producer).start();
		new Thread(consumer).start();
	}

}
