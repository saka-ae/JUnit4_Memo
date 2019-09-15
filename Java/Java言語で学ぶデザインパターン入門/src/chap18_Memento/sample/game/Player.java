package chap18_Memento.sample.game;

import java.util.Random;

public class Player {
	private int _money;
	private Random _random = new Random();


	public Player(int money) {
		_money = money;
	}


	public int getMoney() {
		return _money;
	}


	@Override
	public String toString() {
		return "所持金: " + _money;
	}


	public Memento createMemento() {
		return new Memento(_money);
	}

	public void restoreMemento(Memento memento) {
		_money = memento._money;
	}


	public void doubleUp() {
		boolean success = _random.nextBoolean();

		if (success) {
			_money *= 2;
			System.out.println("ダブルアップ成功");
		} else {
			_money /= 2;
			System.out.println("ダブルアップ失敗");
		}
	}

}
