package chap19_State.sample;

public abstract class Context {
	public static int MORNING_HOUR	= 6;
	public static int NIGHT_HOUR	= 18;

	private State _state = DayState.getInstance();


	protected State getState() {
		return _state;
	}

	protected void setState(State state) {
		_state = state;
	}


	public boolean isDay(int hour) {
		return (hour >= MORNING_HOUR) && (hour < NIGHT_HOUR);
	}

	public boolean isNight(int hour) {
		return !isDay(hour);
	}


	public abstract void setClock(int hour);

	public abstract void changeState(State state);

	public abstract void greet();

	public abstract void printText(String text);

}
