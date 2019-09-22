package chap3.リスト3_02_トイレの空きを待つ繰り返し処理;

public class Main {
	private static final int LIMIT = 3;


	public static void main(String[] args) {
		int count = 0;

		while (count < LIMIT) {
			System.out.println("1分待つ");
			count++;
		}
	}

}
