package chap10.ex10_3;

import java.util.Objects;

public class Wizard {
	private int		_hp;
	private int		_mp;
	private String		_name;
	private Wand		_wand;


	public void heal(Hero hero) {
		int basePoint		= 10;
		int recoveryPoint	= (int) (basePoint * _wand.getPower());

		hero.setHp(hero.getHp() + recoveryPoint);
		System.out.format("%sのHPを%d回復した！\n", hero.getName(), recoveryPoint);
	}


	public int getHp() {
		return _hp;
	}

	public void setHp(int hp) {
		final int lower = 0;
		if (hp < lower)
			_hp = 0;
		else
			_hp = hp;
	}


	public int getMp() {
		return _mp;
	}

	public void setMp(int mp) {
		final int lower = 0;
		if (mp < lower)
			throw new IllegalArgumentException("MPが小さすぎる");

		_mp = mp;
	}


	public String getName() {
		return _name;
	}

	public void setName(String name) {
		if (Objects.isNull(name))
			throw new IllegalArgumentException("名前がnull");

		final int lower = 3;
		if (name.length() < lower)
			throw new IllegalArgumentException("名前が短すぎる");

		_name = name;
	}


	public Wand getWand() {
		return _wand;
	}

	public void setWand(Wand wand) {
		if (Objects.isNull(wand))
			throw new IllegalArgumentException("杖がnull");

		_wand = wand;
	}

}
