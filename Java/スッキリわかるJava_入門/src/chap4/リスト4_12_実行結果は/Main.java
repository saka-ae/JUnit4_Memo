package chap4.リスト4_12_実行結果は;

public class Main {

	public static void main(String[] args) {
		int[] scores = {10, 30, 50};

		int[] copy = scores;
		copy[0] = 70;

		System.out.println(scores[0]);
	}

}
