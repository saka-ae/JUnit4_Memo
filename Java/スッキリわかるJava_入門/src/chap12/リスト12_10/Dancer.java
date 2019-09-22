package chap12.リスト12_10;

import chap12.リスト12_08.Character;
import chap12.リスト12_08.Matango;

public class Dancer extends Character {

	@Override
	public void attack(Matango m) {
		System.out.println(super.getName() + "の攻撃");

		final int damage = 3;
		System.out.format("敵に%dポイントのダメージ\n", damage);
		int hp = m.getHp();
		m.setHp(hp - damage);
	}


	public void dance() {
		System.out.println(super.getName() + "は情熱的に踊った");
	}

}
