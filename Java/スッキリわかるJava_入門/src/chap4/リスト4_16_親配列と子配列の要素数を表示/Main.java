package chap4.リスト4_16_親配列と子配列の要素数を表示;

public class Main {

	public static void main(String[] args) {
		int[][] numbers = { { 1, 2, 3 }, { 4, 5, 6} };

		System.out.println("2次元配列の行数: " + numbers.length);
		System.out.println("2次元配列の列数: " + numbers[0].length);
	}

}
