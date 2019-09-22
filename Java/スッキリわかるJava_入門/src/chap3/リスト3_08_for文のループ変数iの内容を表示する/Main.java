package chap3.リスト3_08_for文のループ変数iの内容を表示する;

public class Main {
	private static final int MAX = 3;


	public static void main(String[] args) {
		for (int i=0; i < MAX; i++)
			System.out.println("i = " + i);
	}

}
