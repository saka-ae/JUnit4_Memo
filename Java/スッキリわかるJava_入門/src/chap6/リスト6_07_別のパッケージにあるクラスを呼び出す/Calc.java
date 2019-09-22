package chap6.リスト6_07_別のパッケージにあるクラスを呼び出す;

public class Calc {

	public static void main(String[] args) {
		int a = 10;
		int b = 2;

		int sum = chap6.リスト6_06_CalcLogicクラスをcalcapp_logicsパッケージに所属させる.calcapp.logics.CalcLogic.add(a, b);
		System.out.format("%d + %d = %d\n", a, b, sum);

		int sub = chap6.リスト6_06_CalcLogicクラスをcalcapp_logicsパッケージに所属させる.calcapp.logics.CalcLogic.subtract(a, b);
		System.out.format("%d - %d = %d\n", a, b, sub);
	}

}
