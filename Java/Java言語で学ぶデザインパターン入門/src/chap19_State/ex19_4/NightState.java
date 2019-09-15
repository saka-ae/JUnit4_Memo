package chap19_State.ex19_4;

public class NightState implements State {
	private static NightState _singleton = new NightState();


	private NightState() { }


	public static NightState getInstance() {
		return _singleton;
	}


	@Override
	public String toString() {
		return "NightState";
	}


	@Override
	public void doClock(Context context, int hour) {
		if (context.isEmergency())
			return;

		if (context.isDay(hour))
			context.changeState(DayState.getInstance());
		else if (context.isLunch(hour))
			context.changeState(LunchState.getInstance());
	}


	@Override
	public void doGreet(Context context) {
		context.printText("こんばんは");
	}

}
