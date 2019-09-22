package chap13.リスト13_02;

public class Main {

	public static void main(String[] args) {
		Wizard wizard = new Wizard();
		Matango matango = new Matango();

		wizard.setName("Kernighan");
		wizard.attack(matango);
		wizard.fireball(matango);
	}

}
