package chap05.リスト5_12;

public class Outer {

	private int outerMember;

	void outerMethod() {
		int a = 10;

		class Inner {

			public void innerMethod() {
				System.out.println(a);
				System.out.println(outerMember);
			}

		}

		Inner ic = new Inner();
		ic.innerMethod();
	}

}
