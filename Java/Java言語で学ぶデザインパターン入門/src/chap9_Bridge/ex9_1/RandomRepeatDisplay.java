package chap9_Bridge.ex9_1;

import java.util.Random;

import chap9_Bridge.sample.DisplayImpl;
import chap9_Bridge.sample.RepeatDisplay;

public class RandomRepeatDisplay extends RepeatDisplay {
	private Random _random = new Random();


	public RandomRepeatDisplay(DisplayImpl impl) {
		super(impl);
	}


	public void randomDisplay(int times) {
		int randomTimes = _random.nextInt(times);

		super.repeatDisplay(randomTimes);
	}

}
