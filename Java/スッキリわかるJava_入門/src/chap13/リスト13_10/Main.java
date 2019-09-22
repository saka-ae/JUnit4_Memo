package chap13.リスト13_10;

import chap13.リスト13_09.Monster;

public class Main {

	public static void main(String[] args) {
		Monster slime		= new Slime();
		Monster goblin		= new Goblin();
		Monster deathBat	= new DeathBat();

		Monster[] monsters = { slime, goblin, deathBat };

		for (Monster m : monsters)
			m.run();
	}

}
