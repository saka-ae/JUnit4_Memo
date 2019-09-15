package chap17_Observer.sample;

import java.util.ArrayList;
import java.util.List;

public abstract class NumberGenerator {
	private List<Observer>	_observers = new ArrayList<>();
	private int			_number;


	public void addObserver(Observer observer) {
		_observers.add(observer);
	}

	public void deleteObserver(Observer observer) {
		_observers.remove(observer);
	}

	public void notifyObservers() {
		for (Observer observer : _observers)
			observer.update(this);
	}


	public int getNumber() {
		return _number;
	}

	protected void setNumber(int number) {
		_number = number;
	}


	public abstract void execute();

}
