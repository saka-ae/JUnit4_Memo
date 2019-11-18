package chap19.ex19_1;

public class Main {
	
	public static void main(String[] args) {
		Thread t1 = new CountUpThread();
		Thread t2 = new CountUpThread();
		Thread t3 = new CountUpThread();
		
		Thread[] threads = { t1, t2, t3 };
		
		for (Thread t : threads)
			t.start();
	}

}
