package chap9.リスト9_08;

public class Hero {
	private static final int SLEEP_RECOVERY	= 100;
	private static final int SLIP_DAMAGE		= 5;

	String	_name;
	int		_hp;


	public Hero() {
		_hp = 100;
	}


	public void sleep() {
		_hp = SLEEP_RECOVERY;
		System.out.println(_name + "は、眠って回復した！");
	}

	public void sit(int sec) {
		_hp += sec;
		System.out.format("%sは%d秒座った！\n", _name, sec);
		System.out.format("HPが%dポイント回復した\n", sec);
	}

	public void slip() {
		_hp -= SLIP_DAMAGE;
		System.out.println(_name + "は、転んだ！");
		System.out.println(SLIP_DAMAGE + "のダメージ！");
	}

	public void run() {
		System.out.println(_name + "は、逃げ出した！");
		System.out.println("GAME OVER");
		System.out.format("最終HPは%dでした\n", _hp);
	}

}
