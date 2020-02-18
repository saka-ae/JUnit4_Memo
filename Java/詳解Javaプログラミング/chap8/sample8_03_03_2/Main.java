package chap8.sample8_03_03_2;

public class Main {

	public static void main(String[] args) {
		Producer producer = new Producer();
		NamedConsumer consumerA = new NamedConsumer(producer, "A");
		NamedConsumer consumerB = new NamedConsumer(producer, "B");

		new Thread(producer).start();
		new Thread(consumerA).start();
		new Thread(consumerB).start();
	}

}
