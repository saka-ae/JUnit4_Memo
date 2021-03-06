package chap7_Builder.ex7_3;

import java.util.Arrays;
import java.util.List;

import chap7_Builder.ex7_2.Builder;
import chap7_Builder.ex7_2.Director;


public class Main {

	public static void main(String[] args) {
		String title		= "Greeting";
		String str			= "Morning, Noon, Evening";
		List<String> items	= Arrays.asList("Good morning", "Good afternoon", "Good evening");

		Builder upperTextBuilder = new UpperTextBuilder(title, str, items);

		Director director = new Director(upperTextBuilder);
		director.construct();

		System.out.println(upperTextBuilder);
	}

}
