package chap19_State.ex19_4;

public class LunchState implements State {
	private static LunchState _singleton = new LunchState();


	private LunchState() { }


	public static LunchState getInstance() {
		return _singleton;
	}


	@Override
	public String toString() {
		return "LunchState";
	}


	@Override
	public void doClock(Context context, int hour) {
		if (context.isDay(hour))
			context.changeState(DayState.getInstance());
		else if (context.isNight(hour))
			context.changeState(NightState.getInstance());
	}


	@Override
	public void doGreet(Context context) {
		context.printText("食事中");
	}

}
