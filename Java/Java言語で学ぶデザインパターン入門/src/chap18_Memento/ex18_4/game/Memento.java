package chap18_Memento.ex18_4.game;

import java.io.Serializable;

public class Memento implements Serializable {
	int _money;


	Memento(int money) {
		_money = money;
	}


	public int getMoney() {
		return _money;
	}

}
