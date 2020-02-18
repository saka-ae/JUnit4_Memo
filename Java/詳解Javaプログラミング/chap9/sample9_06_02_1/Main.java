package chap9.sample9_06_02_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		String text		= "A horse is a horse, of course of course...";
		String regex	= "horse|course";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);

		while (matcher.find()) {
			String matched = matcher.group();
			int index = matcher.start();

			System.out.printf("Matched: %s at position %d\n", matched, index);
		}

	}

}
