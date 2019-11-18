package chap03.リスト3_01;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		for (int num : nums)
			System.out.println(num);
	}
	
}
