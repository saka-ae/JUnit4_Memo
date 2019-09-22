package chap6.リスト6_01_計算機プログラム;

public class Calc {

	public static void main(String[] args) {
		int a = 10;
		int b = 2;

		int sum = add(a, b);
		System.out.format("%d + %d = %d\n", a, b, sum);

		int sub = subtract(a, b);
		System.out.format("%d - %d = %d\n", a, b, sub);
	}


	public static int add(int x, int y) {
		return x + y;
	}

	public static int subtract(int x, int y) {
		return x - y;
	}

}
