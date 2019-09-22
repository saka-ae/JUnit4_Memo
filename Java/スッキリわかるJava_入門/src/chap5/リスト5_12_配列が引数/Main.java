package chap5.リスト5_12_配列が引数;

public class Main {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };

		printArray(nums);
	}


	public static void printArray(int[] array) {
		for (int num : array)
			System.out.println(num);

	}

}
