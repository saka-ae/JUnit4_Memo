package chap01.リスト1_02;

public class Main {

	public static void main(String[] args) {
		String str	= "Java and JavaScript";
		String word	= "Java";

		if (str.contains(word))
			System.out.format("%sは%sを含んでいる\n", str, word);

		if (str.endsWith(word))
			System.out.format("%sは%sが末尾にある\n", str, word);

		System.out.format("%sで%sが最初に登場する位置は%d\n", str, word, str.indexOf(word));

		System.out.format("%sで%sが最後に登場する位置は%d\n", str, word, str.lastIndexOf(word));
	}

}
