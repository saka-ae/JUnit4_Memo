package chap5.リスト5_05_引数の例_渡す値が複数の場合;

public class Main {

	public static void main(String[] args) {
		sum(1, 2);
	}


	public static void sum(int x, int y) {
		int ans = x + y;

		System.out.format("%d + %d = %d\n", x, y, ans);
	}

}
