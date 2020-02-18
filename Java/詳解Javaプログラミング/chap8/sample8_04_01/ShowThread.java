package chap8.sample8_04_01;

public class ShowThread extends Thread {

	private String message;

	public ShowThread(String message) {
		this.message = message;
	}

	public void run() {
		while (true)
			System.out.println(message);
	}

}
