package chap7_Builder.sample;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		String title		= "Greeting";
		String str			= "Morning, Noon, Evening";
		List<String> items	= Arrays.asList("Good morning", "Good afternoon", "Good evening");

		TextBuilder textBuilder = new TextBuilder(title, str, items);

		Director director = new Director(textBuilder);
		director.construct();

		System.out.println(textBuilder);
	}

}
