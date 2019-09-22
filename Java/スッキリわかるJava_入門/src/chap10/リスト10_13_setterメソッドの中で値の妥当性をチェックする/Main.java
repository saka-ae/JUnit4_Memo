package chap10.リスト10_13_setterメソッドの中で値の妥当性をチェックする;

public class Main {

	public static void main(String[] args) {
		Hero hero = new Hero();

		// 例外を発生させる
		hero.setName("");
	}

}
