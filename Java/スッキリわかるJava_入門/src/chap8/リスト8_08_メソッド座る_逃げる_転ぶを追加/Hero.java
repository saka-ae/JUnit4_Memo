package chap8.リスト8_08_メソッド座る_逃げる_転ぶを追加;

public class Hero {
	private static final int SLEEP_RECOVERY	= 100;
	private static final int SLIP_DAMAGE		= 5;

	private String	_name;
	private int	_hp;


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
