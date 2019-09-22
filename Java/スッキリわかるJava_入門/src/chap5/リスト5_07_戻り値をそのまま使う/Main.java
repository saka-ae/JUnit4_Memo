package chap5.リスト5_07_戻り値をそのまま使う;

public class Main {

	public static void main(String[] args) {
		int x = 1;
		int y = 2;

		System.out.format("%d + %d = %d\n", sum(x, y), sum(x, y), sum(sum(x, y), sum(x, y)));
	}


	public static int sum(int a, int b) {
		return a + b;
	}

}
