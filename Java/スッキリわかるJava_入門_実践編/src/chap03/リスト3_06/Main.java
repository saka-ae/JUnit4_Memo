package chap03.リスト3_06;

import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Set<Integer> nums = new TreeSet<>();

		nums.add(1);
		nums.add(2);
		nums.add(3);

		for (int num : nums)
			System.out.print(num + " → ");

		System.out.println();
	}

}
