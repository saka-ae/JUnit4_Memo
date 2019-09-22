package chap10.リスト10_04_HPをprivateにしたサンプルコード;

import chap9.リスト9_03_Sword型フィールドを持つクラス.Sword;

public class Hero {
	static int		_money;

	private int	_hp;
	String			_name;
	Sword			_sword;


	public void sleep() {
		_hp = 100;
		System.out.println(_name + "は、眠って回復した！");
	}

}
