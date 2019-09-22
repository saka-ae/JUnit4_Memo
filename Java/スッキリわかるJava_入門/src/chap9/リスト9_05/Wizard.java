package chap9.リスト9_05;

public class Wizard {

	private static final int RECOVERY_POINT = 10;

	String	_name;
	int		_hp;


	public void heal(Hero hero) {
		hero._hp += RECOVERY_POINT;
		System.out.format("%sのHPを%d回復した！\n", hero._name, RECOVERY_POINT);
	}

}
