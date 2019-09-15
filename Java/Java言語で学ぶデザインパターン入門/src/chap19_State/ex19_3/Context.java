package chap19_State.ex19_3;

public abstract class Context {
	public static int MORNING_HOUR	= 6;
	public static int NIGHT_HOUR	= 18;

	public static int BEGIN_LUNCH_HOUR	= 12;
	public static int END_LUNCH_HOUR	= 13;

	private State _state = DayState.getInstance();


	protected State getState() {
		return _state;
	}

	protected void setState(State state) {
		_state = state;
	}


	public boolean isDay(int hour) {
		return (hour >= MORNING_HOUR) && (hour < NIGHT_HOUR) && !isLunch(hour);
	}

	public boolean isNight(int hour) {
		return !isDay(hour) && !isLunch(hour);
	}

	public boolean isLunch(int hour) {
		return (hour >= BEGIN_LUNCH_HOUR) && (hour < END_LUNCH_HOUR);
	}


	public abstract void setClock(int hour);

	public abstract void changeState(State state);

	public abstract void greet();

	public abstract void printText(String text);

}
