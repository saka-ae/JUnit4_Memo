package chap14_Chain_Of_Responsibility.sample;

public class Trouble {
	private TroubleLevel _level;


	public Trouble(TroubleLevel level) {
		_level = level;
	}


	public TroubleLevel getLevel() {
		return _level;
	}


	@Override
	public String toString() {
		String str = String.format("[Trouble %s]", _level);

		return str;
	}

}
