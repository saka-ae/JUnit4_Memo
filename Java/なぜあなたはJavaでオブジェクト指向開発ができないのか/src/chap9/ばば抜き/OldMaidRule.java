package chap9.ばば抜き;

import chap8.トランプゲームのフレームワーク.Card;
import chap8.トランプゲームのフレームワーク.EmptyCard;
import chap8.トランプゲームのフレームワーク.Hand;
import chap8.トランプゲームのフレームワーク.Rule;

public class OldMaidRule implements Rule {

	@Override
	public Card findCard(Hand hand, Card addedCard) {
		int addedCardumber = addedCard.getNumber();

		for (int i=0; i < hand.getNumberOfCards(); i++) {
			Card lookingCard		= hand.look(i);
			int lookingCardNumber	= lookingCard.getNumber();

			if (lookingCardNumber == addedCardumber)
				return hand.pick(i);
		}

		return EmptyCard.getInstance();
	}

}
