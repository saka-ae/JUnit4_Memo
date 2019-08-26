package chap3.じゃんけんプログラム_オブジェクト指向プログラミング;

public class Player {
	private String _name;
	private int _winCount = 0;


	public Player(String name) {
		_name = name;
	}


	public int getWinCount() {
		return _winCount;
	}

	public void addWinCount() {
		_winCount++;
	}


	@Override
	public String toString() {
		return _name;
	}


	public static Player createNullPlayer() {
		return new NullPlayer();
	}

	public boolean isNullPlayer() {
		return this instanceof NullPlayer;
	}


	public Hand showHand() {
		return Hand.getRandomHand();
	}

}
