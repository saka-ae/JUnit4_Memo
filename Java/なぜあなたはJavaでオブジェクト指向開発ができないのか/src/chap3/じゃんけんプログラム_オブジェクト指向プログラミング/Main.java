package chap3.じゃんけんプログラム_オブジェクト指向プログラミング;

public class Main {

	public static void main(String[] args) {
		Judge judge斎藤 = new Judge();
		Player player村田 = new Player("村田");
		Player player山田 = new Player("山田");

		judge斎藤.startじゃんけん(player村田, player山田);
	}

}
