package chap9.七並べ;

import java.util.LinkedHashMap;
import java.util.Map;

import chap8.トランプゲームのフレームワーク.Card;
import chap8.トランプゲームのフレームワーク.EmptyCard;
import chap8.トランプゲームのフレームワーク.Hand;
import chap8.トランプゲームのフレームワーク.Suit;
import chap8.トランプゲームのフレームワーク.Table;

public class FantanTable implements Table {
	private Map<Suit, Hand> _cards;


	public FantanTable() {
		_cards = new LinkedHashMap<>();

		for (Suit suit : Suit.values()) {
			Hand hand = new Hand();

			for (int i=0; i < Card.NUMBER_OF_SUIT_CARDS; i++) {
				EmptyCard emptyCard = EmptyCard.getInstance();
				hand.add(emptyCard);
			}

			_cards.put(suit, hand);
		}
	}


	@Override
	public String toString() {
		String result = "";

		for (Suit suit : Suit.values()) {
			Hand cardsOfSuit = getCardsOfSuit(suit);
			StringBuilder sb = new StringBuilder();

			for (int i=0; i < cardsOfSuit.getNumberOfCards(); i++) {
				Card placedCard = cardsOfSuit.look(i);

				sb.append(placedCard);
				sb.append(" ");
			}

			result += sb.toString().trim();
			result += System.lineSeparator();
		}

		return result.trim();
	}


	@Override
	public void putCard(Card card) {
		int index = getIndexToPut(card);

		Suit suit = card.getSuit();
		Hand cardsOfSuit = getCardsOfSuit(suit);
		cardsOfSuit.replace(index, card);
	}

	private Hand getCardsOfSuit(Suit suit) {
		return _cards.get(suit);
	}

	private int getIndexToPut(Card card) {
		int number = card.getNumber();

		return number - 1;
	}


	@Override
	public boolean existCard(Card card) {
		int index = getIndexToPut(card);

		Suit suit = card.getSuit();
		Hand cardsOfSuit = getCardsOfSuit(suit);
		Card placedCard = cardsOfSuit.look(index);

		return !placedCard.isEmptyCard();
	}

}