package chap8.ex8_3;

public class Cleric {
	private static final int MAX_HP = 50;
	private static final int MAX_MP = 10;

	String	_name;
	int		_hp = MAX_HP;
	int		_mp = MAX_MP;


	public void selfAid() {
		final int 消費Mp = 5;

		if (_mp < 消費Mp) {
			System.out.println("MPが足りない");
			return;
		}

		System.out.println(_name + "はセルフエイドを唱えた！");
		_mp -= 消費Mp;
		_hp = MAX_HP;
		System.out.println("HPが最大まで回復した");
	}

}
