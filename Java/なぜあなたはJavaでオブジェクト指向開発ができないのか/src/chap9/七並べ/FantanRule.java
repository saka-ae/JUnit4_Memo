package chap9.七並べ;

import chap8.トランプゲームのフレームワーク.Card;
import chap8.トランプゲームのフレームワーク.EmptyCard;
import chap8.トランプゲームのフレームワーク.Hand;
import chap8.トランプゲームのフレームワーク.Rule;
import chap8.トランプゲームのフレームワーク.Suit;
import chap8.トランプゲームのフレームワーク.Table;

public class FantanRule implements Rule {
	private static final int PASS_LIMIT		= 3;
	private static final int SPECIAL_NUMBER	= 7;


	@Override
	public Card findCard(Hand hand, Table table) {
		for (int i=0; i < hand.getNumberOfCards(); i++) {
			Card card = hand.look(i);

			if (canPut(card, table))
				return hand.pick(i);
		}

		return EmptyCard.getInstance();
	}

	private boolean canPut(Card card, Table table) {
		Suit suit	= card.getSuit();
		int number	= card.getNumber();

		Card leftCard	= new Card(suit, numberOfLeftCard(number));
		Card rightCard	= new Card(suit, numberOfRightCard(number));

		return table.existCard(leftCard) || (table.existCard(rightCard));
	}

	private int numberOfLeftCard(int number) {
		return (number == Card.MIN_NUMBER) ? Card.MAX_NUMBER : number - 1;
	}

	private int numberOfRightCard(int number) {
		return (number == Card.MAX_NUMBER) ? Card.MIN_NUMBER : number + 1;
	}


	public static boolean isSpecialNumberCard(Card card) {
		return card.getNumber() == SPECIAL_NUMBER;
	}

	public static boolean overPassLimit(int count) {
		return count > PASS_LIMIT;
	}

}