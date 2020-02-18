package chap8.sample8_01_01_3;

public class Main {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				int count = 5;
				
				for (int i=0; i < count; i++)
					System.out.println(i);
			}

		});
		
		thread.start();
	}

}
