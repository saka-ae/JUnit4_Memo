package chap3_Template_Method.sample;

public abstract class AbstractDisplay {

	protected abstract void prefix();
	protected abstract void suffix();
	protected abstract void print();


	public final void display() {
		prefix();

		for (int i=0; i < 5; i++)
			print();

		suffix();

		System.out.println();
	}

}
