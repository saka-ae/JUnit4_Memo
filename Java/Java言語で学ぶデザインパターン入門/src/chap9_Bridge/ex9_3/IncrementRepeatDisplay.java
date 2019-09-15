package chap9_Bridge.ex9_3;

import chap9_Bridge.sample.DisplayImpl;
import chap9_Bridge.sample.RepeatDisplay;

public class IncrementRepeatDisplay extends RepeatDisplay {
	private int _step;


	public IncrementRepeatDisplay(DisplayImpl impl, int step) {
		super(impl);

		_step = step;
	}


	public void incrementRepeatDisplay(int times) {
		int count = 0;

		for (int i=0; i < times; i++) {
			super.repeatDisplay(count);
			System.out.println();

			count += _step;
		}
	}

}
