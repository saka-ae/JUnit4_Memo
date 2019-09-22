package chap4.ex4_2;

public class Main {

	public static void main(String[] args) {
		int[] numbers = { 100, 200, 300 };

		System.out.println("for文で表示");
		for (int i=0; i < numbers.length; i++)
			System.out.println(numbers[i]);

		System.out.println();
		
		System.out.println("拡張for文で表示");
		for (int num : numbers)
			System.out.println(num);
	}

}
