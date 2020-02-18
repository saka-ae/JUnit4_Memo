package chap8.sample8_01_01_1;

public class Count implements Runnable {

	private Thread thread;
	private int count;

	public Count(int count) {
		this.count = count;

		thread = new Thread(this);
		thread.start();
	}


	@Override
	public void run() {
		for (int i=0; i < count; i++)
			System.out.println(i);
	}


}
