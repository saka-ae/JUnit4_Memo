package chap5.じゃんけんプログラム_インタフェース;

public class Main {

	public static void main(String[] args) {
		Judge judge斎藤 = new Judge();

		Tactics 村田Tactics = new AskTactics();
		Player player村田 = new Player("村田", 村田Tactics);

		Tactics 山田Tactics = new CyclicTactics();
		Player player山田 = new Player("山田", 山田Tactics);

		judge斎藤.startじゃんけん(player村田, player山田);
	}

}
