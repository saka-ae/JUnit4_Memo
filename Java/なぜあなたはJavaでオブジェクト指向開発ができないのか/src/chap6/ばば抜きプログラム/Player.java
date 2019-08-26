package chap6.ばば抜きプログラム;

public class Player {
	private String	_name;
	private Master	_master;
	private Hand	_cards = new Hand();


	public Player(String name, Master master) {
		_name	= name;
		_master	= master;
	}


	public Hand getHand() {
		return _cards;
	}


	@Override
	public String toString() {
		return _name;
	}


	public void receiveCard(Card card) {
		Card sameNumberCard = _cards.selectSameNumberCard(card);

		if (sameNumberCard.isEmptyCard()) {
			_cards.addCard(card);

			return;
		}

		Card[] cards = new Card[] { card, sameNumberCard };

		discard(cards);
	}
	private void discard(Card[] cards) {
		StringBuilder sb = new StringBuilder();

		for (Card card : cards)
			sb.append(card + " ");

		String str = sb.toString().trim();
		System.out.format("%s: %sを捨てました\n", this, str);
	}

	public void play(Player enemy) {
		Hand enemyCards = enemy.getHand();
		Card selectedCard = enemyCards.selectRandomCard();

		if (checkWin(enemy))
			_master.declareWin(enemy);

		if (_master.isGameOver())
			return;

		System.out.format("%s: %sさんから%sを引きました\n", this, enemy, selectedCard);
		receiveCard(selectedCard);

		if (checkWin(this)) {
			_master.declareWin(this);

			return;
		}

		System.out.format("%s: 残りの手札は%sです\n", this, _cards);
		System.out.println();
	}
	private boolean checkWin(Player player) {
		Hand cards = player.getHand();

		return cards.getNumberOfCards() == 0;
	}
}
