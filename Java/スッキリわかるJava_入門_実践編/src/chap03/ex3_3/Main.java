package chap03.ex3_3;

import java.util.HashMap;
import java.util.Map;

import chap03.ex3_2.Hero;

public class Main {

	public static void main(String[] args) {
		Hero heroA = new Hero("A");
		Hero heroB = new Hero("B");

		Map<Hero, Integer> heroesMap = new HashMap<>();
		heroesMap.put(heroA, 10);
		heroesMap.put(heroB, 20);

		for (Hero hero : heroesMap.keySet()) {
			String name = hero.getName();
			int num = heroesMap.get(hero);

			System.out.printf("%s : %d\n", name, num);
		}
	}

}
