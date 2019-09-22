package chap6.リスト6_05_Calcクラスをcalcapp_mainパッケージに所属させる.calcapp.main;

import chap6.リスト6_02_CalcLogic_javaに計算処理を追加する.CalcLogic;

public class Calc {

	public static void main(String[] args) {
		int a = 10;
		int b = 2;

		int sum = CalcLogic.add(a, b);
		System.out.format("%d + %d = %d\n", a, b, sum);

		int sub = CalcLogic.subtract(a, b);
		System.out.format("%d - %d = %d\n", a, b, sub);
	}

}
