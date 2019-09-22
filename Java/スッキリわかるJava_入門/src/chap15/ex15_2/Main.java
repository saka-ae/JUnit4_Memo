package chap15.ex15_2;

public class Main {

	public static void main(String[] args) {
		String str = null;

		try {
			System.out.println(str.length());
		} catch (NullPointerException e) {
			System.out.println("NullPointerExceptionをcatchしました");

			System.out.println("--スタックトレース（start）--");

			e.printStackTrace();

			System.out.println("--スタックトレース（end）--");
		}
	}

}
