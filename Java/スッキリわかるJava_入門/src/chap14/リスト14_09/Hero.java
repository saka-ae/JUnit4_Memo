package chap14.リスト14_09;

public class Hero {
	String	_name;
	int		_hp;

	@Override
	public String toString() {
		return String.format("名前: %s/HP: %d", _name, _hp);
	}
}
