package chap8.トランプゲームのフレームワーク;

public class Card {
	public static final int MIN_NUMBER				= 1;
	public static final int MAX_NUMBER				= 13;
	public static final int NUMBER_OF_SUIT_CARDS	= MAX_NUMBER - MIN_NUMBER + 1;


	private Suit 	_suit;
	private int		_number;


	public Card(Suit suit, int number) {
		_suit	= suit;
		_number	= number;
	}


	public Suit getSuit() {
		return _suit;
	}
	public void setSuit(Suit suit) {
		_suit = suit;
	}

	public int getNumber() {
		return _number;
	}
	public void setNumber(int number) {
		_number = number;
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append(_suit);

		switch (_number) {
			case 1:
				sb.append("A");
				break;
			case 11:
				sb.append("J");
				break;
			case 12:
				sb.append("Q");
				break;
			case 13:
				sb.append("K");
				break;
			default:
				sb.append(_number);
		}

		return sb.toString();
	}


	public boolean isJoker() {
		return this instanceof Joker;
	}


	public boolean isEmptyCard() {
		return this instanceof EmptyCard;
	}

}