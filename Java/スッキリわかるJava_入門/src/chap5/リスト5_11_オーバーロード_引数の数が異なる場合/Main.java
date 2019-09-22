package chap5.リスト5_11_オーバーロード_引数の数が異なる場合;

public class Main {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;

		System.out.format("%d + %d = %d\n", a, b, add(a, b));

		System.out.format("%d + %d + %d = %d\n", a, b, c, add(a, b, c));
	}


	public static int add(int x, int y) {
		return x + y;
	}

	public static int add(int x, int y, int z) {
		return x + y + z;
	}

}
