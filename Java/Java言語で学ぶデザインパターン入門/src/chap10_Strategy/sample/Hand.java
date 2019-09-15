package chap10_Strategy.sample;

import static chap10_Strategy.sample.Result.*;

public enum Hand {
	グー, チョキ, パー;


	public Result fight(Hand enemy) {
		if (isDrawWith(enemy))
			return DRAW;
		else if (isStrongerThan(enemy))
			return WIN;
		else
			return LOSE;
	}


	private boolean isDrawWith(Hand hand) {
		return this.equals(hand);
	}

	private boolean isStrongerThan(Hand hand) {
		return			(this.equals(グー)		&& hand.equals(チョキ))
					||	(this.equals(チョキ)	&& hand.equals(パー))
					||	(this.equals(パー)		&& hand.equals(グー));
	}

}
