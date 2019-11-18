package chap03.ex3_2;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Hero heroA = new Hero("A");
		Hero heroB = new Hero("B");

		List<Hero> heroes = Arrays.asList(heroA, heroB);
		for (Hero hero : heroes)
			System.out.println(hero.getName());
	}

}
