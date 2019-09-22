package chap9.リスト9_12_コンストラクタのオーバーロード;

public class Main {

	public static void main(String[] args) {
		Hero hero = new Hero("Kernighan");
		System.out.println(hero._name);
		
		Hero dummy = new Hero();
		System.out.println(dummy._name);
	}

}
