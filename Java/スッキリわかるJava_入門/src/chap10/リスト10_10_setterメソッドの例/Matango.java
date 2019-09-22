package chap10.リスト10_10_setterメソッドの例;

public class Matango {

	private final int LEVEL = 10;

	int 	_hp;
	char	_suffix;


	void run() {
		System.out.format("お化けキノコ%cは逃げ出した！\n", _suffix);
	}

}
