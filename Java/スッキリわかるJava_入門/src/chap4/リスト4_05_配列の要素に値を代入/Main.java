package chap4.リスト4_05_配列の要素に値を代入;

public class Main {
	private static final int ELEMENTS = 5;


	public static void main(String[] args) {
		int[] scores = new int[ELEMENTS];

		scores[1] = 30;

		System.out.println(scores[1]);
	}

}
