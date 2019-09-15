package chap12_Decorator.ex12_1;

import chap12_Decorator.sample.Display;
import chap12_Decorator.sample.SideBorder;
import chap12_Decorator.sample.StringDisplay;

public class Main {

	public static void main(String[] args) {
		Display disp = new StringDisplay("Hello world!");
		Display sideDdecorate = new SideBorder(disp, '*');
		Display upDownDecorate = new UpDownBorder(sideDdecorate, '+');

		upDownDecorate.show();
	}

}
