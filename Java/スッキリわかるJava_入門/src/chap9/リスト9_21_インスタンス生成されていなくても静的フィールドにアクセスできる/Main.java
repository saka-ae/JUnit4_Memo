package chap9.リスト9_21_インスタンス生成されていなくても静的フィールドにアクセスできる;

public class Main {

	public static void main(String[] args) {
		Hero._money = 100;
		System.out.println(Hero._money);
	}

}
