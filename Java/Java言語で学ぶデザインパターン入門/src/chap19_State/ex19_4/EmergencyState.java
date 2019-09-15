package chap19_State.ex19_4;

public class EmergencyState implements State {
	private static EmergencyState _singleton = new EmergencyState();


	private EmergencyState() { }


	public static EmergencyState getInstance() {
		return _singleton;
	}


	@Override
	public String toString() {
		return "EmergencyState";
	}


	@Override
	public void doClock(Context context, int hour) {
		;
	}


	@Override
	public void doGreet(Context context) {
		context.printText("非常事態");
	}

}
