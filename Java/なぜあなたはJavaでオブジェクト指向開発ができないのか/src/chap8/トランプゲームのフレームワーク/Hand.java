package chap8.トランプゲームのフレームワーク;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand {
	private List<Card> _cards = new ArrayList<>();


	public int getNumberOfCards() {
		return _cards.size();
	}

	public Card look(int index) {
		return _cards.get(index);
	}

	public void add(Card card) {
		_cards.add(card);
	}
	public void replace(int index, Card card) {
		_cards.set(index, card);
	}

	public Card pick(int index) {
		return _cards.remove(index);
	}
	public Card pick(Card card) {
		_cards.remove(card);

		return card;
	}

	public Card pickRandom() {
		shuffle();

		return pick(0);
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		for (Card card : _cards) {
			sb.append(card);
			sb.append(" ");
		}

		return sb.toString().trim();
	}


	public void shuffle() {
		Collections.shuffle(_cards);
	}

}