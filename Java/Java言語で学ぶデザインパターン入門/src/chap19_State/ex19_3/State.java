package chap19_State.ex19_3;

public interface State {

	void doClock(Context context, int hour);

	void doGreet(Context context);

}
