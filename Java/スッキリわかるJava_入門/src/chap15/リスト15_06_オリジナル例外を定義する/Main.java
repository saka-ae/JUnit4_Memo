package chap15.リスト15_06_オリジナル例外を定義する;

public class Main {

	public static void main(String[] args) {
		try {
			throw new UnsupportedMusicFileException("未対応のファイル");
		} catch (Exception e) {
			 e.printStackTrace();
		 }
	}

}
