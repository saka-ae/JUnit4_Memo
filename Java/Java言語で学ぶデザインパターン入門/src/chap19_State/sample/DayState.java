package chap19_State.sample;

public class DayState implements State {
	private static DayState _singleton = new DayState();


	private DayState() { }


	public static DayState getInstance() {
		return _singleton;
	}


	@Override
	public String toString() {
		return "DayState";
	}


	@Override
	public void doClock(Context context, int hour) {
		if (context.isNight(hour))
			context.changeState(NightState.getInstance());
	}


	@Override
	public void doGreet(Context context) {
		context.printText("こんにちは");
	}

}
