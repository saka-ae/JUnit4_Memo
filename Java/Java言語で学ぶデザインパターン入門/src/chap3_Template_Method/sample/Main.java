package chap3_Template_Method.sample;

public class Main {

	public static void main(String[] args) {
		AbstractDisplay chDisplay = new CharDisplay('A');
		chDisplay.display();

		AbstractDisplay strDisplay = new StringDisplay("Hello world!");
		strDisplay.display();
	}

}
