package chap4.リスト4_07_配列の初期化;

public class Main {
	private static final int ELEMENTS = 5;


	public static void main(String[] args) {
		int[] scores = new int[ELEMENTS];

		System.out.println("int[]の要素のデフォルト値: " + scores[1]);
	}

}
