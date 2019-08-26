package chap8.トランプゲームのフレームワーク;

public class Joker extends Card {

	public Joker() {
		super(null, 0);
	}


	@Override
	public String toString() {
		return "JK";
	}


	@Override
	public void setSuit(Suit suit) {
		super.setSuit(suit);
	}

	@Override
	public void setNumber(int number) {
		super.setNumber(number);
	}

}