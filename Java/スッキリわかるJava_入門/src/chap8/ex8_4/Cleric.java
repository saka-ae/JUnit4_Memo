package chap8.ex8_4;

import java.util.Random;

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

	public int pray(int sec) {
		Random random = new Random();
		final int UPPER = 2;
		int randomPoint = random.nextInt(UPPER + 1);

		int recoveryPoint = sec + randomPoint;

		int recoveried;
		if ((_mp + recoveryPoint) > MAX_MP)
			recoveried = MAX_MP - _mp;
		else
			recoveried = recoveryPoint;

		System.out.println(_name + "は祈った！");
		_mp += recoveried;
		System.out.format("MPが%d回復した\n", recoveried);

		return recoveried;
	}

}
