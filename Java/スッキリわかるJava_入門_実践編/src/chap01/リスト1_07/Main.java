package chap01.リスト1_07;

public class Main {

	public static void main(String[] args) {
		String str = "abc,def:ghi";

		String[] words = str.split("[,:]");
		for (String word : words)
			System.out.print(word + "->");
	}

}
