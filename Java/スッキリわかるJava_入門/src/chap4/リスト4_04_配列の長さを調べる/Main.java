package chap4.リスト4_04_配列の長さを調べる;

public class Main {
	private static final int ELEMENTS = 5;


	public static void main(String[] args) {
		int[] scores = new int[ELEMENTS];

		int elements = scores.length;

		System.out.println("要素の数: " + elements);
	}

}
