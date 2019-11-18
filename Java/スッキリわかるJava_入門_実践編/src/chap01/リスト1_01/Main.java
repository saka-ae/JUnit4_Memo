package chap01.リスト1_01;

public class Main {

	public static void main(String[] args) {
		String upperCase = "JAVA";
		String lowerCase = "java";

		if (upperCase.equals(lowerCase))
			System.out.format("%sと%sは等しい\n", upperCase, lowerCase);
		else if (upperCase.equalsIgnoreCase(lowerCase))
			System.out.format("%sと%sはケースを区別しなければ等しい\n", upperCase, lowerCase);

		String str = "abc";
		System.out.format("%sの長さは%dです\n", str, str.length());
		
		if (str.isEmpty())
			System.out.println(str + "は空文字です");
	}

}
