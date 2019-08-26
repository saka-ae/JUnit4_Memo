package chap6.ばば抜きプログラム;

public class Card {
	public static final int MIN_CARD_NUMBER	= 1;
	public static final int MAX_CARD_NUMBER	= 13;
	public static final int NUMBER_OF_CARDS	= MAX_CARD_NUMBER - MIN_CARD_NUMBER + 1;

	private Suit _suit;
	private int _number;


	public Card(Suit suit, int number) {
		_suit	= suit;
		_number	= number;
	}


	public int getNumber() {
		return _number;
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


	public static Card createJoker() {
		return new Joker();
	}

	public boolean isJoker() {
		return this instanceof Joker;
	}


	public static Card createEmptyCard() {
		return new EmptyCard();
	}

	public boolean isEmptyCard() {
		return this instanceof EmptyCard;
	}

}
