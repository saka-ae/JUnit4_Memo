package chap10_Strategy.sample;

public class InOrderStrategy implements Strategy {
	private int _index = 0;


	@Override
	public Hand nextHand() {
		Hand[] allHands = Hand.values();
		if (_index >= allHands.length)
			_index = 0;

		Hand hand = allHands[_index];

		_index++;

		return hand;
	}

}
