package chap12_Decorator.ex12_2;


public class Main {

	public static void main(String[] args) {
		MultiStringDisplay disp = new MultiStringDisplay("abc");
		disp.add("12345");

		MultiDisplay multiSideBorder = new MultiSideBorder(disp, '*');
		multiSideBorder.show();
	}

}
