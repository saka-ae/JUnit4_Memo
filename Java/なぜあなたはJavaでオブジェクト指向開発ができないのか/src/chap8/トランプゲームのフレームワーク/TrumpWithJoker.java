package chap8.トランプゲームのフレームワーク;

public class TrumpWithJoker extends TrumpExceptJoker {

	@Override
	public Hand createTrump() {
		Hand trump = super.createTrump();

		Joker joker = new Joker();
		trump.add(joker);

		return trump;
	}

}
