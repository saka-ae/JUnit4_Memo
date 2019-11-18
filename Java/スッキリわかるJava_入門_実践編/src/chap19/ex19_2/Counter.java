package chap19.ex19_2;

public class Counter {

	private long count;

	public synchronized void add(long i) {
		System.out.println("足し算");

		this.count += i;
	}

	public synchronized void mul(long i) {
		System.out.println("掛け算");

		this.count *= i;
	}

}
