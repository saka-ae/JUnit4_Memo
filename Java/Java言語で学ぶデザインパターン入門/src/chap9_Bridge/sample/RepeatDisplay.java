package chap9_Bridge.sample;

public class RepeatDisplay extends Display {

	public RepeatDisplay(DisplayImpl impl) {
		super(impl);
	}


	public void repeatDisplay(int times) {
		super.delegateSetUp();

		for (int i=0; i < times; i++)
			super.delegatePrint();

		super.delegateTearDown();
	}

}
