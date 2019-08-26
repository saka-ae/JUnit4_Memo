package chap6.ばば抜きプログラム;

import static chap6.ばば抜きプログラム.Card.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand {
	private List<Card> _cards = new ArrayList<>();


	public void addCard(Card card) {
		_cards.add(card);
	}

	public Card selectCard() {
		return _cards.remove(0);
	}
	private Card selectCard(Card card) {
		_cards.remove(card);

		return card;
	}
	public Card selectRandomCard() {
		Collections.shuffle(_cards);

		return selectCard();
	}

	public int getNumberOfCards() {
		return _cards.size();
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		for (Card card : _cards)
			sb.append(card + " ");

		return sb.toString().trim();
	}


	public Card selectSameNumberCard(Card addedCard) {
		for (Card card : _cards)
			if (isSameCardNumber(card, addedCard))
				return selectCard(card);

		return Card.createEmptyCard();
	}
	private boolean isSameCardNumber(Card card1, Card card2) {
		return card1.getNumber() == card2.getNumber();
	}


	public static Hand createTrump() {
		Hand trump = new Hand();

		for (Suit suit: Suit.values())
			for (int number = MIN_CARD_NUMBER; number <= MAX_CARD_NUMBER; number++)
				trump.addCard(new Card(suit, number));


		Card joker = Card.createJoker();
		trump.addCard(joker);

		return trump;
	}


	public void shuffle() {
		Collections.shuffle(_cards);
	}

}
