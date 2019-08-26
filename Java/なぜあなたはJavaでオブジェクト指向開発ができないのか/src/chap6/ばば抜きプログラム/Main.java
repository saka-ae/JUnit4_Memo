package chap6.ばば抜きプログラム;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Master master = new Master();

		Player player村田 = new Player("村田", master);
		Player player山田 = new Player("山田", master);
		Player player斎藤 = new Player("斎藤", master);
		List<Player> players = Arrays.asList(player村田, player山田, player斎藤);

		for (Player player : players)
			master.addPlayer(player);

		master.startGame();
	}

}
