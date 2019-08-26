package chap8.トランプゲームのフレームワーク;

public class EmptyCard extends Card {
	private static final EmptyCard _singleton = new EmptyCard();


	private EmptyCard() {
		super(null, 0);
	}


	@Override
	public String toString() {
		return "..";
	}


	public static EmptyCard getInstance() {
		return _singleton;
	}

}