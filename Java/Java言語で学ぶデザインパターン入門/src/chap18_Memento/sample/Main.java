package chap18_Memento.sample;

import chap18_Memento.sample.game.Memento;
import chap18_Memento.sample.game.Player;

public class Main {
	private static final int MAX	= 100;
	private static final int TIMES	= 10;


	public static void main(String[] args) {
		Player player = new Player(100);
		Memento memento = player.createMemento();

		for (int i=0; i < MAX; i++) {
			System.out.println(player);

			player.doubleUp();

			if (player.getMoney() >= memento.getMoney() * TIMES) {
				System.out.println(TIMES +  "倍になったのでセーブ");
				memento = player.createMemento();
			} else if (player.getMoney() <= memento.getMoney() / TIMES) {
				System.out.println(TIMES +  "分の1になったのでロード");
				player.restoreMemento(memento);
			}
		}

		System.out.format("\n最終的な所持金: %d\n", player.getMoney());
	}

}
