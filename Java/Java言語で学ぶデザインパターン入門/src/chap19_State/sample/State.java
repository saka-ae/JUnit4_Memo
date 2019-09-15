package chap19_State.sample;

public interface State {

	void doClock(Context context, int hour);

	void doGreet(Context context);

}
