package chap14.リスト14_10;

public class Main {

	public static void main(String[] args) {
		Hero hero1 = new Hero();
		hero1._name	= "A";
		hero1._hp	= 100;

		Hero hero2 = new Hero();
		hero2._name	= "A";
		hero2._hp	= 100;

		if (hero1.equals(hero2))
			System.out.println("同じ内容");
		else
			System.out.println("違う内容");
	}

}
