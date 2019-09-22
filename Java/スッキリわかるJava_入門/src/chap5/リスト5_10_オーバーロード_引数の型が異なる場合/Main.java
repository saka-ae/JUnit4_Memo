package chap5.リスト5_10_オーバーロード_引数の型が異なる場合;

public class Main {

	public static void main(String[] args) {
		System.out.println(add(1, 2));

		System.out.println(add(0.2, 0.3));

		System.out.println(add("abc", "xyz"));
	}


	public static int add(int x, int y) {
		return x + y;
	}

	public static double add(double x, double y) {
		return x + y;
	}

	public static String add(String x, String y) {
		return x + y;
	}

}
