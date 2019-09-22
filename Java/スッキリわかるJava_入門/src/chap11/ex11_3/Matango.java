package chap11.ex11_3;

public class Matango {
	int 	_hp		= 50;
	char	_suffix;


	public Matango(char suffix) {
		_suffix = suffix;
	}


	void attack(Hero hero) {
		System.out.format("キノコ%sの攻撃\n", _suffix);

		final int damage = 10;
		int hp = hero.getHp();
		hero.setHp(hp - damage);

		System.out.println(damage + "のダメージ");
	}

}
