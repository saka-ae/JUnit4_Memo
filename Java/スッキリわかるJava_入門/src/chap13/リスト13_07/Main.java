package chap13.リスト13_07;

public class Main {

	public static void main(String[] args) {
		Character hero1		= new Hero();
		Character hero2		= new Hero();
		Character thief		= new Thief();
		Character wizard1	= new Wizard();
		Character wizard2	= new Wizard();

		Character[] characters = { hero1, hero2, thief, wizard1, wizard2 };

		// 宿屋に泊まる
		for (Character c : characters) {
			final int recovery = 50;
			int oldHp = c.getHp();

			int newHp = oldHp + recovery;
			c.setHp(newHp);
		}
	}

}
