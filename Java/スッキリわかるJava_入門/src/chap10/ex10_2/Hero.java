package chap10.ex10_2;

import java.util.Objects;

public class Hero {
	private int	_hp;
	private String	_name;


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


	public int getHp() {
		return _hp;
	}

	public void setHp(int hp) {
		_hp = hp;
	}

}
