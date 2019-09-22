package chap5.リスト5_13_同じ配列を参照していることを確認する;

public class Main {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };

		incrementArray(nums);

		printArray(nums);
	}


	public static void printArray(int[] array) {
		for (int num : array)
			System.out.println(num);

	}


	public static void incrementArray(int[] array) {
		for (int i=0; i < array.length; i++)
			array[i]++;
	}

}
