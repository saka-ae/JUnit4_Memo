package chap9.リスト9_03_Sword型フィールドを持つクラス;

public class Main {

	public static void main(String[] args) {
		Sword sword = new Sword();
		sword._name		= "炎の剣";
		sword._damage	= 10;

		Hero hero = new Hero();
		hero._name	= "Kernighan";
		hero._hp	= 100;
		hero._sword	= sword;

		System.out.println("現在の武器は" + hero._sword._name);
	}

}
