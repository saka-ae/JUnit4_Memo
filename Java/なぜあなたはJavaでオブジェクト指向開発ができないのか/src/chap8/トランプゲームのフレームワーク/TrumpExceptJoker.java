package chap8.トランプゲームのフレームワーク;

public class TrumpExceptJoker implements Trump {

	@Override
	public Hand createTrump() {
		Hand trump = new Hand();

		for (Suit suit : Suit.values())
			for (int number = Card.MIN_NUMBER; number <= Card.MAX_NUMBER; number++) {
				Card card = new Card(suit, number);
				trump.add(card);
			}

		return trump;
	}

}
