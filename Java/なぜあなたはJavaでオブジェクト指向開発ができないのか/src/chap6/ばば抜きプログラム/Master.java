package chap6.ばば抜きプログラム;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Master {
	List<Player> _players = new ArrayList<>();


	public void addPlayer(Player player) {
		_players.add(player);
	}


	public void startGame() {
		prepareGame();

		System.out.println("【ばば抜きを開始します】\n");

		Player prevPlayer = nextPlayer();
		while (!isGameOver()) {
			Player player = prevPlayer;
			System.out.println(player + "さんの番です");

			Player nextPlayer = nextPlayer();
			player.play(nextPlayer);

			prevPlayer = nextPlayer;
		}

		System.out.println("【ばば抜きを終了しました】");
	}
	private void prepareGame() {
		Hand trump = Hand.createTrump();
		trump.shuffle();

		System.out.println("【カードを配ります】");
		while (trump.getNumberOfCards() > 0) {
			Card card = trump.selectCard();

			Player player = nextPlayer();
			player.receiveCard(card);
		}

		System.out.println();
	}
	private Player nextPlayer() {
		Player result = _players.get(0);
		Collections.rotate(_players, 1);

		return result;
	}

	public void declareWin(Player winner) {
		System.out.println(winner + "さんが上がりました！\n");

		_players.remove(_players.indexOf(winner));

		if (isGameOver()) {
			Player loser = _players.get(0);
			System.out.println(loser + "さんの負けです！\n");
		}
	}

	public boolean isGameOver() {
		return _players.size() == 1;
	}

}
