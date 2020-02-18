package chap12.sample12_3.protocol;

public class MyCalculation extends WorkRequest {

	private int n;


	public MyCalculation(int n) {
		this.n = n;
	}


	@Override
	public Object execute() {
		return n * n;
	}

}
