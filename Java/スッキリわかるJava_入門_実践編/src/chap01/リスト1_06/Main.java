package chap01.リスト1_06;

public class Main {

	boolean isValidName(String name) {
		String pattern = "[0-9] {3}";

		return name.matches(pattern);
	}

}
