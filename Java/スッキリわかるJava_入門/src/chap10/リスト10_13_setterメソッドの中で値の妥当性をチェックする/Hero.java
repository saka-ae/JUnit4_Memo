package chap10.リスト10_13_setterメソッドの中で値の妥当性をチェックする;

import java.util.Objects;

import chap9.リスト9_03_Sword型フィールドを持つクラス.Sword;

public class Hero {
	static int		_money;

	private int	_hp;
	private String	_name;
	Sword			_sword;


	public void sleep() {
		_hp = 100;
		System.out.println(_name + "は、眠って回復した！");
	}

	private void die() {
		System.out.println(_name + "は死んでしまった！");
		System.out.println("GAME OVERです。");
	}

	public void attack(Matango matango) {
		;
	}


	public String getName() {
		return _name;
	}

	public void setName(String name) {
		if (Objects.isNull(name))
			throw new IllegalArgumentException("名前がnullである。処理を中断");

		final int lower = 2;
		if (name.length() < lower)
			throw new IllegalArgumentException("名前が短すぎる。処理を中断");

		final int upper = 7;
		if (name.length() > upper)
			throw new IllegalArgumentException("名前が長すぎる。処理を中断");

		_name = name;
	}

}
