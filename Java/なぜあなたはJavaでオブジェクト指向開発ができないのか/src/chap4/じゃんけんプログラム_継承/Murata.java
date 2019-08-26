package chap4.じゃんけんプログラム_継承;

import static chap3.じゃんけんプログラム_オブジェクト指向プログラミング.Hand.*;

import chap3.じゃんけんプログラム_オブジェクト指向プログラミング.Hand;
import chap3.じゃんけんプログラム_オブジェクト指向プログラミング.Player;

public class Murata extends Player {

	public Murata(String name) {
		super(name);
	}

	@Override
	public Hand showHand() {
		return グー;
	}

}
