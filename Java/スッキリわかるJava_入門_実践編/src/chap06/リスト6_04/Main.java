package chap06.リスト6_04;

import java.util.function.IntBinaryOperator;

public class Main {

	public static void main(String[] args) {
		IntBinaryOperator func = (int a, int b) -> { return a - b; };

		int x = 5;
		int y = 3;

		int z = func.applyAsInt(x, y);

		System.out.printf("%d - %d = %d\n", x, y, z);
	}

}
