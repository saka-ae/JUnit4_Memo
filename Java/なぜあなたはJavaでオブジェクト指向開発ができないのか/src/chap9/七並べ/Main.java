package chap9.七並べ;

import java.util.Arrays;
import java.util.List;

import chap8.トランプゲームのフレームワーク.Master;
import chap8.トランプゲームのフレームワーク.Player;
import chap8.トランプゲームのフレームワーク.Rule;
import chap8.トランプゲームのフレームワーク.Table;
import chap8.トランプゲームのフレームワーク.Trump;
import chap8.トランプゲームのフレームワーク.TrumpExceptJoker;

public class Main {

	public static void main(String[] args) {
		Trump	trump	= new TrumpExceptJoker();
		Master	master	= new FantanMaster(trump);
		Table	table	= new FantanTable();
		Rule	rule	= new FantanRule();

		Player player村田 = new FantanPlayer("村田", master, table, rule);
		Player player山田 = new FantanPlayer("山田", master, table, rule);
		Player player斎藤 = new FantanPlayer("斎藤", master, table, rule);
		List<Player> players = Arrays.asList(player村田, player山田, player斎藤);

		for (Player player : players)
			master.addPlayer(player);

		master.prepareGame();

		master.startGame();
	}

}
