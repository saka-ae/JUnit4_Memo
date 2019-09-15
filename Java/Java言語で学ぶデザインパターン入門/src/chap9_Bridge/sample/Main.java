package chap9_Bridge.sample;

public class Main {

	public static void main(String[] args) {
		StringDisplayImpl strDisp = new StringDisplayImpl("Hello world!");

		Display disp = new Display(strDisp);
		disp.display();

		RepeatDisplay repeatDisp = new RepeatDisplay(strDisp);
		repeatDisp.repeatDisplay(3);
	}

}
