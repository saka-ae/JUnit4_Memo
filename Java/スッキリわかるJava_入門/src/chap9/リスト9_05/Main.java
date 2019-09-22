package chap9.リスト9_05;

public class Main {

	public static void main(String[] args) {
		Hero hero1 = new Hero();
		hero1._name	= "Kernighan";

		Hero hero2 = new Hero();
		hero2._name	= "Schildt";

		Wizard wizard = new Wizard();
		wizard._name	= "";

		wizard.heal(hero1);
		wizard.heal(hero2);
	}

}
