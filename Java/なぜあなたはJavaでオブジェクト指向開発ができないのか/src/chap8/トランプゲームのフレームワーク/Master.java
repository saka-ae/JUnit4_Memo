package chap8.トランプゲームのフレームワーク;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Master {
	private Trump 			_trump;
	private List<Player>	_players = new ArrayList<>();


	public Master(Trump trump) {
		_trump = trump;
	}

	public void addPlayer(Player player) {
		_players.add(player);
	}

	public void removePlayer(Player player) {
		_players.remove(player);
	}

	protected Trump getTrump() {
		return _trump;
	}


	public void declareWin(Player winner) {
		System.out.println(winner + "さんが上がりました！");
		removePlayer(winner);
	}


	public void prepareGame() {
		System.out.println("【カードを配ります】\n");

		Hand trump = _trump.createTrump();
		trump.shuffle();

		for (int i=0; i < trump.getNumberOfCards(); i++) {
			Player player = getNextPlayer();
			setNextPlayer();

			Card card = trump.look(i);
			player.receiveCard(card);
		}

		System.out.println();
	}

	protected Player getNextPlayer() {
		return _players.get(0);
	}

	protected void setNextPlayer() {
		Collections.rotate(_players, 1);
	}


	public void startGame() {
		System.out.println("【ゲームを開始します】");

		while (!isGameOver()) {
			System.out.println();

			Player player = getNextPlayer();
			setNextPlayer();
			System.out.println(player + "さんの番です。");

			Player nextPlayer = getNextPlayer();
			player.play(nextPlayer);
		}

		declareGameOver();

		System.out.println("【ゲームを終了しました】");
	}

	protected boolean isGameOver() {
		return _players.size() == 1;
	}

	private void declareGameOver() {
		Player loser = _players.get(0);
		System.out.println(loser + "さんの負けです！\n");
	}

}