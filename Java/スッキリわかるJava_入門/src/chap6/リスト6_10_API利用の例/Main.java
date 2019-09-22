package chap6.リスト6_10_API利用の例;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] heights = { 3, 2, 1 };

		Arrays.sort(heights);

		for (int height : heights)
			System.out.println(height);
	}

}
