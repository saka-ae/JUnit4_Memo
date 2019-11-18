package chap03.リスト3_05;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Set<String> colors = new HashSet<>();

		colors.add("red");
		colors.add("blue");
		colors.add("yellow");

		for (String color : colors)
			System.out.print(color + " → ");
		
		System.out.println();
	}

}
