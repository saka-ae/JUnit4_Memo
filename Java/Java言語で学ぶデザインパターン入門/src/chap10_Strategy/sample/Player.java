package chap10_Strategy.sample;

public class Player {
	private String 	_name;
	private Strategy	_strategy;
	private int		_winCount = 0;


	public Player(String name, Strategy strategy) {
		_name		= name;
		_strategy	= strategy;
	}


	public int getWinCount() {
		return _winCount;
	}
	public void addWinCount() {
		_winCount++;
	}

	public Hand showHand() {
		return _strategy.nextHand();
	}


	@Override
	public String toString() {
		return _name;
	}

}
