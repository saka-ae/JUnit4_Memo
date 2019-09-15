package chap9_Bridge.ex9_3;

import chap9_Bridge.sample.DisplayImpl;

public class Main {

	public static void main(String[] args) {
		DisplayImpl impl = new CharacterDisplayImpl('<', '*', '>');

		IncrementRepeatDisplay disp = new IncrementRepeatDisplay(impl, 1);
		disp.incrementRepeatDisplay(3);
	}

}
