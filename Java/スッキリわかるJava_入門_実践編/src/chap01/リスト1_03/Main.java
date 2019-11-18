package chap01.リスト1_03;

public class Main {

	public static void main(String[] args) {
		String str	= "0123456789";
		int begin	= 3;
		int end	= 8;


		System.out.format("%sの%d以降は%s\n", str, begin, str.substring(begin));

		System.out.format("%sの%d～%dは%s\n", str, begin, (end - 1), str.substring(begin, end));
	}

}
