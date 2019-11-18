package chap07.リスト7_06;

public class RefSample {

	public int times = 0;

	public RefSample(int times) {
		this.times = times;
	}

	public void hello(String msg) {
		hello(msg, times);
	}

	public void hello(String msg, int times) {
		System.out.printf("Hello, %s * %d\n", msg, times);
	}

}
