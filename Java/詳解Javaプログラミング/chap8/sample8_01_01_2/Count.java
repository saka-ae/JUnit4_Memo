package chap8.sample8_01_01_2;

public class Count extends Thread {

	private int count;

	public Count(int count) {
		this.count = count;

		start();
	}


	@Override
	public void run() {
		for (int i=0; i < count; i++)
			System.out.println(i);
	}


}
