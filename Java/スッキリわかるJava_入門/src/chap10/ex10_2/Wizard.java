package chap10.ex10_2;

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
		_hp = hp;
	}


	public int getMp() {
		return _mp;
	}

	public void setMp(int mp) {
		_mp = mp;
	}


	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}


	public Wand getWand() {
		return _wand;
	}

	public void setWand(Wand wand) {
		_wand = wand;
	}

}
