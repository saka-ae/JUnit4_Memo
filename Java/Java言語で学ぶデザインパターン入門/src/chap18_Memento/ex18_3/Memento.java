package chap18_Memento.ex18_3;

public class Memento {
	int _money;

	private int _number;


	Memento(int money) {
		_money = money;
	}


	public int getMoney() {
		return _money;
	}


	int getNumber() {
		return _number;
	}

}
