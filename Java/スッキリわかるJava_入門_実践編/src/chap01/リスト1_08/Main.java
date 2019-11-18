package chap01.リスト1_08;

public class Main {

	public static void main(String[] args) {
		String str = "abcde";

		String replaced = str.replaceAll("[bd]", "X");
		System.out.println(replaced);
	}

}
