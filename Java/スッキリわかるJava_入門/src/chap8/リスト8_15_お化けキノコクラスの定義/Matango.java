package chap8.リスト8_15_お化けキノコクラスの定義;

public class Matango {

	private final int LEVEL = 10;

	int 	_hp;
	char	_suffix;


	void run() {
		System.out.format("お化けキノコ%cは逃げ出した！\n", _suffix);
	}

}
