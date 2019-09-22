package chap11.ex11_3;

public class Hero {
	private String	_name	= "Kernighan";
	private int	_hp		= 100;


	public Hero() {
		System.out.println("Heroのコンストラクタ");
	}


	public int getHp() {
		return _hp;
	}

	public void setHp(int hp) {
		_hp = hp;
	}


	public void attack(Matango m) {
		System.out.println(_name + "の攻撃！");

		final int damage = 5;
		m._hp -= damage;
		System.out.println(damage + "ポイントのダメージをあたえた！");
	}

	public void run() {
		System.out.println(_name + "は逃げ出した！");
	}


	public final void slip() {
		System.out.println(_name + "は転んだ！");

		final int damage = 5;
		_hp -= damage;
		System.out.println(damage + "のダメージ");
	}

}
