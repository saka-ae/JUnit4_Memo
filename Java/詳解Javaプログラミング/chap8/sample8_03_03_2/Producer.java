package chap8.sample8_03_03_2;

import java.time.LocalTime;
import java.util.LinkedList;
import java.util.Queue;

public class Producer implements Runnable {

	private static final int MAX_QUEUE = 5;

	private Queue<String> messages = new LinkedList<>();

	@Override
	public void run() {
		while (true) {
			putMessage();

			sleep1Second();
		}
	}

	private synchronized void putMessage() {
		while (messages.size() >= MAX_QUEUE)
			try {
				wait();
			} catch (InterruptedException e) { }

		LocalTime now = LocalTime.now();
		messages.add(now.toString());

		notifyAll();
	}

	public synchronized String getMessage() {
		while (messages.isEmpty())
			try {
				// キューが空の時はProducerは休止していないので不要
				notifyAll();

				wait();
			} catch (InterruptedException e) { }

		String message = messages.remove();

		notifyAll();

		return message;
	}

	private void sleep1Second() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
