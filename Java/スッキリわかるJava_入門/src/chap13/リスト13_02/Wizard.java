package chap13.リスト13_02;

public class Wizard extends Character {
	private int _mp;


	@Override
	public void attack(Matango m) {
		String name = super.getName();
		System.out.println(name + "の攻撃！");

		final int damage = 3;
		System.out.format("敵に%dポイントのダメージ\n", damage );

		int oldHp = m.getHp();
		int newHp = oldHp - damage;
		m.setHp(newHp);
	}


	public void fireball(Matango m) {
		String name = super.getName();
		System.out.println(name + "は火の玉を放った！");

		final int damage = 20;
		System.out.format("敵に%dポイントのダメージ\n", damage);

		int oldHp = m.getHp();
		int newHp = oldHp - damage;
		m.setHp(newHp);

		final int decrease = 5;
		_mp -= decrease;
	}

}
