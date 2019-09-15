package chap19_State.ex19_4;

public class Main {

	private static final int BEGIN_HOUR	= 0;
	private static final int END_HOUR		= 24;


	public static void main(String[] args) {
		Greet greet = new Greet();

		// 通常状態
		for (int i = BEGIN_HOUR; i < END_HOUR; i++) {
			greet.setClock(i);
			greet.greet();
		}

		// 非常事態
		greet.setEmergency();

		for (int i = BEGIN_HOUR; i < END_HOUR; i++) {
			greet.setClock(i);
			greet.greet();
		}
	}

}
