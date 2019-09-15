package chap9_Bridge.ex9_2;

import chap9_Bridge.sample.Display;

public class Main {

	public static void main(String[] args) {
		TextFileDisplayImpl fileDisp = new TextFileDisplayImpl("text.txt");

		Display disp = new Display(fileDisp);
		disp.display();
	}

}
