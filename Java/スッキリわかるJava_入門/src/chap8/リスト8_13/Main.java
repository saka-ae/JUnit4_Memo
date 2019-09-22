package chap8.リスト8_13;

public class Main {

	public static void main(String[] args) {
		Hero hero = new Hero();
		hero._name	= "Kernighan";
		hero._hp	= 100;
		System.out.format("勇者%sを生み出しました！\n", hero._name);
		
		hero.sit(5);
		hero.slip();
		hero.sit(25);
		hero.run();
	}

}
