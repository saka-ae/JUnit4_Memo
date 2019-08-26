package chap5.じゃんけんプログラム_インタフェース;

import chap3.じゃんけんプログラム_オブジェクト指向プログラミング.Hand;

public class CyclicTactics implements Tactics {
	private final Hand[] _allHands = Hand.values();
	private int _index = 0;


	@Override
	public Hand getHand() {
		if (_index >= _allHands.length)
			_index = 0;

		Hand hand = _allHands[_index];
		_index++;
		return hand;
	}

}
