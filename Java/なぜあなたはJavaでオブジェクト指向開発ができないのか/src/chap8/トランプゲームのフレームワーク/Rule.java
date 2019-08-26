package chap8.トランプゲームのフレームワーク;

public interface Rule {

	default public Card findCard(Hand hand, Table table) {
		throw new NotImplementedException();
	}

	default public Card findCard(Hand hand, Card addedCard) {
		throw new NotImplementedException();
	}

}