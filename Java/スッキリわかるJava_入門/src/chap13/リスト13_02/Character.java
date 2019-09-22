package chap13.リスト13_02;

public abstract class Character {
	private String	_name;
	private int	_hp;


	public String getName() {
		return _name;
	}
	public void setName(String name) {
		_name = name;
	}

	public int getHp() {
		return _hp;
	}


	public abstract void attack(Matango m);


	public void run() { };

}
