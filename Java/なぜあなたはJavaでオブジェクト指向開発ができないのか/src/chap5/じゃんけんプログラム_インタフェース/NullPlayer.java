package chap5.じゃんけんプログラム_インタフェース;

public class NullPlayer extends Player {
	private static final String EMPTY_NAME = "";


	protected NullPlayer() {
		super(EMPTY_NAME, null);
	}

}
