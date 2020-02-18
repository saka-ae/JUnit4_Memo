package chap8.sample8_01_02;

public class Main {

	public static void main(String[] args) {
		Thread thread = new Thread();
		int milliSeconds = 3_000;

		try {
			System.out.println("sleep()開始");
			thread.sleep(milliSeconds);
			System.out.println("sleep()終了");


			System.out.println("static sleep()開始");
			Thread.sleep(milliSeconds);
			System.out.println("static sleep()終了");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
