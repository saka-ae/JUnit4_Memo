package chap5.リスト5_07_戻り値の例;

public class Main {

	public static void main(String[] args) {
		int x = 1;
		int y = 2;

		int ans = sum(x, y);

		System.out.format("%d + %d = %d\n", x, y, ans);
	}


	public static int sum(int a, int b) {
		return a + b;
	}

}
