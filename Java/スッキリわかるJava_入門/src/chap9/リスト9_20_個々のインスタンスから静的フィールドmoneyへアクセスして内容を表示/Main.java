package chap9.リスト9_20_個々のインスタンスから静的フィールドmoneyへアクセスして内容を表示;

public class Main {

	public static void main(String[] args) {
		Hero hero = new Hero();
		Hero._money = 100;
		System.out.println(Hero._money);

		hero._money = 200;
		System.out.println(Hero._money);
	}

}
