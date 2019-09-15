package chap19_State.ex19_3;

public class Main {

	private static final int BEGIN_HOUR	= 0;
	private static final int END_HOUR		= 24;


	public static void main(String[] args) {
		Greet greet = new Greet();

		for (int i = BEGIN_HOUR; i < END_HOUR; i++) {
			greet.setClock(i);
			greet.greet();
		}
	}

}
