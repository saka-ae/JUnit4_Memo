package chap3.じゃんけんプログラム_オブジェクト指向プログラミング;

import static chap3.じゃんけんプログラム_オブジェクト指向プログラミング.Hand.*;

public class Judge {
	private static final int Number_OF_MATCHES = 3;


	public void startじゃんけん(Player player1, Player player2) {
		System.out.println("【じゃんけん開始】\n");

		for (int i=0; i < Number_OF_MATCHES; i++) {
			System.out.format("【%d回戦目】\n", i + 1);

			Player winner = judgeじゃんけん(player1, player2);
			if (winner.isNullPlayer())
				System.out.println("引き分けです！");
			else {
				System.out.println(winner + "さんが勝ちました！");

				winner.addWinCount();
			}

			System.out.println();
		}

		System.out.println("【じゃんけん終了】\n");

		System.out.format("%d 対 %d で", player1.getWinCount(), player2.getWinCount());

		Player finalWinner = judgeFinalWinner(player1, player2);
		if (finalWinner.isNullPlayer())
			System.out.println("引き分けです！");
		else
			System.out.println(finalWinner + "さんの勝ちです！");
	}

	private Player judgeじゃんけん(Player player, Player enemy) {
		Hand playerHand = player.showHand();
		Hand enemyHand = enemy.showHand();

		System.out.format("%s 対 %s\n", playerHand, enemyHand);

		if (playerHand == enemyHand)
			return Player.createNullPlayer();
		else if (playerWin(playerHand, enemyHand))
			return player;
		else
			return enemy;
	}
	private boolean playerWin(Hand playerHand, Hand enemyHand) {
		return (	playerHand == グー   && enemyHand == チョキ)
				|| (playerHand == チョキ && enemyHand == パー)
				|| (playerHand == パー   && enemyHand == グー);
	}

	private Player judgeFinalWinner(Player player, Player enemy) {
		int playerWinCount = player.getWinCount();
		int enemyWinCount  = enemy.getWinCount();

		if (playerWinCount == enemyWinCount)
			return Player.createNullPlayer();
		else if (playerWinCount > enemyWinCount)
			return player;
		else
			return enemy;
	}

}
