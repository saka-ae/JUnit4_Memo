package chap15.ex15_3;

public class Main {

	public static void main(String[] args) {
		String str = "三";

		try {
			int num = Integer.parseInt(str);
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatExceptionをcatchしました");

			System.out.println("--スタックトレース（start）--");

			e.printStackTrace();

			System.out.println("--スタックトレース（end）--");
		}
	}

}
