package chap8.リスト8_16_仮想世界に勇者とお化けキノコ2匹を生み出すプログラム;

public class Main {

	public static void main(String[] args) {
		Hero hero = new Hero();
		hero._name	= "Kernighan";
		hero._hp	= 100;

		Matango mA = new Matango();
		mA._hp		= 50;
		mA._suffix	= 'A';

		Matango mB = new Matango();
		mB._hp		= 48;
		mB._suffix	= 'B';


		hero.slip();
		mA.run();
		mB.run();
		hero.run();
	}

}
