package chap8.sample8_03_03_1;

public class Consumer implements Runnable {

	private Producer producer;

	public Consumer(Producer producer) {
		this.producer = producer;
	}

	@Override
	public void run() {
		while (true) {
			String message = producer.getMessage();
			System.out.println("Got message: " + message);

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
