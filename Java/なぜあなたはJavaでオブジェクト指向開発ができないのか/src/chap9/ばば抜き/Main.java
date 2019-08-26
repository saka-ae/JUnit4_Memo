package chap9.ばば抜き;

import java.util.Arrays;
import java.util.List;

import chap8.トランプゲームのフレームワーク.Master;
import chap8.トランプゲームのフレームワーク.Player;
import chap8.トランプゲームのフレームワーク.Rule;
import chap8.トランプゲームのフレームワーク.Table;
import chap8.トランプゲームのフレームワーク.Trump;
import chap8.トランプゲームのフレームワーク.TrumpWithJoker;

public class Main {

	public static void main(String[] args) {
		Trump	trump	= new TrumpWithJoker();
		Master	master	= new Master(trump);
		Table	table	= new OldMaidTable();
		Rule	rule	= new OldMaidRule();

		Player player村田 = new OldMaidPlayer("村田", master, table, rule);
		Player player山田 = new OldMaidPlayer("山田", master, table, rule);
		Player player斎藤 = new OldMaidPlayer("斎藤", master, table, rule);
		List<Player> players = Arrays.asList(player村田, player山田, player斎藤);

		for (Player player : players)
			master.addPlayer(player);

		master.prepareGame();

		master.startGame();
	}

}