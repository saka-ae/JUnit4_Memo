package chap12.リスト12_08;

public class Matango {
	private final int LEVEL = 10;

	private int 	_hp;
	private char	_suffix;


	public int getHp() {
		return _hp;
	}

	public void setHp(int hp) {
		_hp = hp;
	}


	void run() {
		System.out.format("お化けキノコ%cは逃げ出した！\n", _suffix);
	}

}
