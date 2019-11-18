package chap06.リスト6_05;

import java.util.function.IntToDoubleFunction;

public class Main {

	public static void main(String[] args) {
		double pi = 3.14;

		IntToDoubleFunction func = r -> pi * r * r;

		int x = 2;
		double area = func.applyAsDouble(x);

		System.out.printf("半径%dの円の面積: %f\n", x, area);
	}

}
