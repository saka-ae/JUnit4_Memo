package chap6.ばば抜きプログラム;

public enum Suit {
	ハート, ダイヤ, クラブ, スペード;


	@Override
	public String toString() {
		switch (this) {
			case ハート:
				return "H";
			case ダイヤ:
				return "D";
			case クラブ:
				return "C";
			case スペード:
				return "S";
			default:
				return "";
		}
	}

}
