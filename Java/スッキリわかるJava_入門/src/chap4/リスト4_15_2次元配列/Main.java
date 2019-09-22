package chap4.リスト4_15_2次元配列;

public class Main {
	private static final int ROWS		= 2;
	private static final int COLUMNS	= 3;


	public static void main(String[] args) {
		int[][] numbers = new int[ROWS][COLUMNS];

		numbers[1][1] = 7;

		System.out.println(numbers[1][1]);
	}

}
