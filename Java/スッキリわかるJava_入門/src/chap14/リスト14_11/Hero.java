package chap14.リスト14_11;

public class Hero {
	String	_name;
	int		_hp;


	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;

		if (!(o instanceof Hero))
			return false;

		Hero hero = (Hero) o;

		return this._name.equals(hero._name);
	}

}
