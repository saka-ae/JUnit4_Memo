package chap11.ex11_3;

public class PoisonMatango extends Matango {
	private int _poisonAttackCount = 5;


	public PoisonMatango(char suffix) {
		super(suffix);
	}

	@Override
	public void attack(Hero hero) {
		super.attack(hero);

		if (_poisonAttackCount == 0)
			return;

		System.out.println("さらに毒の胞子をばらまいた！");


		int hp = hero.getHp();
		final int damageRate = 5;
		final int damage = hp / damageRate;
		hero.setHp(hp - damage);

		System.out.println(damage + "ポイントのダメージ");

		_poisonAttackCount--;
	}
}
