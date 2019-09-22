package chap13.リスト13_05;

public class Main {

	public static void main(String[] args) {
		Slime slime = new Slime();
		slime.run();

		Monster monster = slime;
		monster.run();
	}

}
