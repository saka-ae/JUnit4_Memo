package chap04.リスト4_09;


public class Main {

	public static void main(String[] args) {
		Sword sword = new Sword("Before sword");
		String name = "Before name";
		Hero hero = new Hero(name, sword);
		System.out.println(hero);

		Hero clone = hero.clone();
		hero.setName("After name");
		hero.getSword().setName("After sword");
		System.out.println("hero: " + hero);
		System.out.println("clone: " + clone);
	}

}
