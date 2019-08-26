package chap4.じゃんけんプログラム_継承;

import chap3.じゃんけんプログラム_オブジェクト指向プログラミング.Judge;
import chap3.じゃんけんプログラム_オブジェクト指向プログラミング.Player;

public class Main {

	public static void main(String[] args) {
		Judge judge斎藤 = new Judge();
		Player player村田 = new Murata("村田");
		Player player山田 = new Yamada("山田");

		judge斎藤.startじゃんけん(player村田, player山田);
	}

}
