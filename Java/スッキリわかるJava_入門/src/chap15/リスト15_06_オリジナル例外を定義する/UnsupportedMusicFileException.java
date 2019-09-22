package chap15.リスト15_06_オリジナル例外を定義する;

public class UnsupportedMusicFileException extends Exception {

	public UnsupportedMusicFileException(String message) {
		super(message);
	}

}
