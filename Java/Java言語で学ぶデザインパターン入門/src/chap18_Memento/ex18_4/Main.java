package chap18_Memento.ex18_4;

import chap18_Memento.ex18_4.game.Memento;
import chap18_Memento.ex18_4.game.Player;

public class Main {
	private static final int INITIAL_MONEY = 100;

	private static final int LOOP_COUNT	= 100;
	private static final int TIMES			= 10;

	private static final String FILENAME = "game.dat";


	public static void main(String[] args) {
		Player player = new Player(INITIAL_MONEY);

		if (player.existMemento(FILENAME)) {
			Memento memento = player.load(FILENAME);

			player.restoreMemento(memento);
		}

		Memento memento = player.createMemento();

		for (int i=0; i < LOOP_COUNT; i++) {
			System.out.println(player);

			player.doubleUp();

			if (player.getMoney() >= memento.getMoney() * TIMES) {
				System.out.println(TIMES +  "倍になったのでセーブ");
				memento = player.createMemento();

				player.save(FILENAME, memento);
			} else if (player.getMoney() <= memento.getMoney() / TIMES) {
				System.out.println(TIMES +  "分の1になったのでロード");
				player.restoreMemento(memento);
			}
		}

		System.out.format("\n最終的な所持金: %d\n", player.getMoney());
	}

}
