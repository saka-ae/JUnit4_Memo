package chap19_State.ex19_4;

public interface State {

	void doClock(Context context, int hour);

	void doGreet(Context context);


	default void doEmergency(Context context) {
		context.changeState(EmergencyState.getInstance());
	}

}
