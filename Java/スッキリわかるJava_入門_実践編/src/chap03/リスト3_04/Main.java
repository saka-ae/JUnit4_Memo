package chap03.リスト3_04;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Set<String> colors = new HashSet<>();

		colors.add("red");
		colors.add("blue");
		
		colors.add("red");

		System.out.printf("色は%d種類\n", colors.size());
	}

}
