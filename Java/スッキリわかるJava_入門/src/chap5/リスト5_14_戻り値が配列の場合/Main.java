package chap5.リスト5_14_戻り値が配列の場合;

public class Main {

	public static void main(String[] args) {
		int size = 3;

		int[] array = createArray(size);

		printArray(array);
	}


	public static void printArray(int[] array) {
		for (int num : array)
			System.out.println(num);

	}


	public static int[] createArray(int size) {
		int[] array = new int[size];

		for (int i=0; i < array.length; i++)
			array[i] = i;

		return array;
	}

}
