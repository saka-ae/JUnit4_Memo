package chap2.じゃんけんプログラム;

import static chap2.じゃんけんプログラム.Hand.*;

import java.util.Random;

public class シンプルじゃんけん {
	private static final int NUMBER_OF_MATCHES = 3;

	private static int _playerWinCount	= 0;
	private static int _enemyWinCount		= 0;


	public static void main(String[] args) {
		System.out.println("【じゃんけん開始】\n");

		for (int i=0; i < NUMBER_OF_MATCHES; i++) {
			System.out.format("【%d回戦目】\n", i + 1);

			playじゃんけん();
		}

		System.out.println("【じゃんけん終了】\n");

		resultAnnouncement();
	}

	private static void playじゃんけん() {
		Hand playerHand	= randomHand();
		Hand enemyHand	= randomHand();

		System.out.format("%s vs %s %n", playerHand, enemyHand);

		if (playerHand == enemyHand)
			System.out.println("引き分けです！");
		else if (playerWin(playerHand, enemyHand)) {
			System.out.println("プレイヤー１が勝ちました！");

			_playerWinCount++;
		} else {
			System.out.println("プレイヤー２が勝ちました！");

			_enemyWinCount++;
		}

		System.out.println();
	}

	private static Hand randomHand() {
		Hand[] allHands = Hand.values();

		Random random = new Random();
		int index = random.nextInt(allHands.length);

		return allHands[index];
	}

	private static boolean playerWin(Hand playerHand, Hand enemyHand) {
		return 		(playerHand == グー		&& enemyHand == チョキ)
					||	(playerHand == チョキ	&& enemyHand == パー)
					||	(playerHand == パー		&& enemyHand == グー);
	}

	private static void resultAnnouncement() {
		System.out.format("%d 対 %d で", _playerWinCount, _enemyWinCount);
		if (_playerWinCount == _enemyWinCount)
			System.out.println("引き分けです！");
		else if (_playerWinCount > _enemyWinCount)
			System.out.println("プレイヤー１の勝ちです！");
		else
			System.out.println("プレイヤー２の勝ちです！");
	}

}
