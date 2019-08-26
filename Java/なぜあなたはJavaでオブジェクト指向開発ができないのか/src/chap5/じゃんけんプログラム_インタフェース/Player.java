package chap5.じゃんけんプログラム_インタフェース;

import chap3.じゃんけんプログラム_オブジェクト指向プログラミング.Hand;

public class Player {
	private String _name;
	private Tactics _tactics;
	private int _winCount = 0;


	public Player(String name, Tactics tactics) {
		_name = name;
		_tactics = tactics;
	}

	public int getWinCount() {
		return _winCount;
	}

	public void addWinCount() {
		_winCount ++;
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
		return _tactics.getHand();
	}

}
