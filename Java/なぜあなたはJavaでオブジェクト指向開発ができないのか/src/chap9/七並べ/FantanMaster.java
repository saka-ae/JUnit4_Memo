package chap9.七並べ;

import chap8.トランプゲームのフレームワーク.Master;
import chap8.トランプゲームのフレームワーク.Trump;

public class FantanMaster extends Master {

	public FantanMaster(Trump trump) {
		super(trump);
	}


	public void pass(FantanPlayer player) {
		int passCount = player.getPassCount();
		System.out.format("%sさんは%d回目のパスをしました！\n", player, passCount);

		if (overPassLimit(passCount)) {
			System.out.println(player + "さんは負けです！");

			removePlayer(player);
		}
	}

	private boolean overPassLimit(int passCount) {
		return FantanRule.overPassLimit(passCount);
	}

}