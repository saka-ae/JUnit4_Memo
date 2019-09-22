package chap3.リスト3_09_for文のループを2重にして九九の表を出力する;

public class Main {
	private static final int FIRST	= 1;
	private static final int LAST	= 9;


	public static void main(String[] args) {
		for (int i = FIRST; i <= LAST; i++)
			for (int j = FIRST; j <= LAST; j++) {
				String delimiter = (j == LAST) ? System.lineSeparator() : " ";

				System.out.format("%2d%s", i * j, delimiter);
			}
	}

}
