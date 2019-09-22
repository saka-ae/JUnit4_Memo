package chap10.ex10_1;

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

}
