package chap10.リスト10_13_setterメソッドの中で値の妥当性をチェックする;

public class Matango {

	private final int LEVEL = 10;

	int 	_hp;
	char	_suffix;


	void run() {
		System.out.format("お化けキノコ%cは逃げ出した！\n", _suffix);
	}

}
