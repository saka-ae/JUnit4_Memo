package chap11.リスト11_05;

import chap11.リスト11_01_戦うと逃げるしかできないHeroクラス.Hero;

public class Main {

	public static void main(String[] args) {
		Hero hero = new Hero();
		hero.run();

		SuperHero superHero = new SuperHero();
		superHero.run();
	}

}
