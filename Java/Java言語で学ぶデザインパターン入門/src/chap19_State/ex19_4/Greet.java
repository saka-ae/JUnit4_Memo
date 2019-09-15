package chap19_State.ex19_4;

public class Greet extends Context {

	@Override
	public void setClock(int hour) {
		System.out.println("現在時刻: " + hour);

		State state = super.getState();

		state.doClock(this, hour);
	}

	@Override
	public void changeState(State newState) {
		State oldState = super.getState();

		super.setState(newState);

		System.out.format("%sから%sに移行\n", oldState, newState);
	}

	@Override
	public void greet() {
		State state = super.getState();

		state.doGreet(this);
	}

	@Override
	public void printText(String text) {
		System.out.println(text);
	}


	@Override
	public void setEmergency() {
		System.out.println("非常事態");

		State state = super.getState();

		state.doEmergency(this);
	}

}
