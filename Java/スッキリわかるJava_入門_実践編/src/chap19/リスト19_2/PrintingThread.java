package chap19.リスト19_2;

public class PrintingThread extends Thread {

	@Override
	public void run() {
		for (int i=0; i < 10; i++)
			System.out.print(i);
	}

}
