package chap5.じゃんけんプログラム_インタフェース;

import static chap3.じゃんけんプログラム_オブジェクト指向プログラミング.Hand.*;

import chap3.じゃんけんプログラム_オブジェクト指向プログラミング.Hand;

public class グーOnlyTactics implements Tactics {

	@Override
	public Hand getHand() {
		return グー;
	}

}
