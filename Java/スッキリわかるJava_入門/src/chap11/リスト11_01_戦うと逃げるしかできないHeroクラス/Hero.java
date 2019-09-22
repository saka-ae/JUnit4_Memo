package chap11.リスト11_01_戦うと逃げるしかできないHeroクラス;

public class Hero {
	private String	_name	= "Kernighan";
	private int	_hp		= 100;


	public void attack(Matango m) {
		System.out.println(_name + "の攻撃！");

		final int damage = 5;
		m._hp -= damage;
		System.out.println(damage + "ポイントのダメージをあたえた！");
	}

	public void run() {
		System.out.println(_name + "は逃げ出した！");
	}

}
