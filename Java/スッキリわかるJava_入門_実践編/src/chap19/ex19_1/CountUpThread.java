package chap19.ex19_1;

public class CountUpThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i <= 50; i++)
			System.out.print(i + " ");

		System.out.println();
	}

}
