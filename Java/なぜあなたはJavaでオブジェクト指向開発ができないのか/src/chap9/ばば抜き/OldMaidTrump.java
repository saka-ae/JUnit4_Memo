package chap9.ばば抜き;

import chap8.トランプゲームのフレームワーク.Hand;
import chap8.トランプゲームのフレームワーク.Joker;
import chap8.トランプゲームのフレームワーク.TrumpExceptJoker;

public class OldMaidTrump extends TrumpExceptJoker {

	@Override
	public Hand createTrump() {
		Hand trump = super.createTrump();

		Joker joker = new Joker();
		trump.add(joker);

		return trump;
	}

}
