package chap05.リスト5_11;

public class Outer {

	private static int outerStaticField;

	private int outerField;

	static class Inner {

		void innerMethod() {
			outerStaticField = 10;
		}

	}

	void outerMethod() {
		Inner ic = new Inner();
	}

}
