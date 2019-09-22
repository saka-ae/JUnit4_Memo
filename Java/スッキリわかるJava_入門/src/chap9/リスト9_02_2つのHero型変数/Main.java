package chap9.リスト9_02_2つのHero型変数;

public class Main {

	public static void main(String[] args) {
		Hero hero1;
		hero1 = new Hero();
		hero1._hp = 100;

		Hero hero2 = hero1;
		hero2._hp = 200;
		
		System.out.println(hero1._hp);
	}

}
