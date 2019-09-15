package chap9_Bridge.ex9_1;

import chap9_Bridge.sample.StringDisplayImpl;

public class Main {

	public static void main(String[] args) {
		StringDisplayImpl strDisp = new StringDisplayImpl("Hello world!");

		RandomRepeatDisplay disp = new RandomRepeatDisplay(strDisp);
		disp.randomDisplay(3);
	}

}
