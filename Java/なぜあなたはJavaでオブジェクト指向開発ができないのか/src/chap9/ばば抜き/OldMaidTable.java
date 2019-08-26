package chap9.ばば抜き;

import chap8.トランプゲームのフレームワーク.Card;
import chap8.トランプゲームのフレームワーク.Table;

public class OldMaidTable implements Table {

	@Override
	public void putCard(Card card) {
		System.out.print(card + " ");
	}

}
