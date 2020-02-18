package chap8.sample8_03_03_2;

public class NamedConsumer implements Runnable {

	private Producer producer;
	private String name;

	public NamedConsumer(Producer producer, String name) {
		this.producer	= producer;
		this.name		= name;
	}

	@Override
	public void run() {
		while (true) {
			String message = producer.getMessage();
			System.out.printf("%s Got message: %s\n", name, message);

			sleep2Seconds();
		}
	}

	private void sleep2Seconds() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
