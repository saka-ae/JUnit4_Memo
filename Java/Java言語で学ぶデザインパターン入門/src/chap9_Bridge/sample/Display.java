package chap9_Bridge.sample;

public class Display {
	private DisplayImpl _impl;


	public Display(DisplayImpl impl) {
		_impl = impl;
	}


	public void delegateSetUp() {
		_impl.setUp();
	}

	public void delegateTearDown() {
		_impl.tearDown();
	}

	public void delegatePrint() {
		_impl.print();
	}


	public final void display() {
		delegateSetUp();
		delegatePrint();
		delegateTearDown();
	}

}
