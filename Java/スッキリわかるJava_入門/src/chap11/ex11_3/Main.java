package chap11.ex11_3;

public class Main {

	public static void main(String[] args) {
		Hero hero = new Hero();
		PoisonMatango poisonMatango = new PoisonMatango('A');
		
		poisonMatango.attack(hero);
	}
	
}
