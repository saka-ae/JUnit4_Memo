package chap9.リスト9_03_Sword型フィールドを持つクラス;

public class Hero {

	private static final int DAMAGE= 5;

	String	_name;
	int		_hp;
	Sword	_sword;


	public void attack() {
		System.out.println(_name + "は攻撃した！");
		System.out.format("敵に%dのダメージをあたえた！\n", DAMAGE);
	}

}
