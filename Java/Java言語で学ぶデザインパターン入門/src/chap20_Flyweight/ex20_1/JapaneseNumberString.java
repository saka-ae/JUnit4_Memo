package chap20_Flyweight.ex20_1;

import chap20_Flyweight.sample.JapaneseNumber;
import chap20_Flyweight.sample.JapaneseNumberFactory;

public class JapaneseNumberString {
	private JapaneseNumber[] _japaneseNumbers;


	public JapaneseNumberString(String numCharacters) {
		initShared(numCharacters);
	}

	public JapaneseNumberString(String numCharacters, boolean shared) {
		if (shared)
			initShared(numCharacters);
		else
			initUnshared(numCharacters);
	}


	public void print() {
		for (JapaneseNumber jNum : _japaneseNumbers)
			jNum.print();
	}


	private void initShared(String numCharacters) {
		_japaneseNumbers = new JapaneseNumber[numCharacters.length()];

		JapaneseNumberFactory factory = JapaneseNumberFactory.getInstance();
		for (int i=0; i < _japaneseNumbers.length; i++) {
			char numCh = numCharacters.charAt(i);
			_japaneseNumbers[i] = factory.getJapaneseNumber(numCh);
		}
	}

	private void initUnshared(String numCharacters) {
		_japaneseNumbers = new JapaneseNumber[numCharacters.length()];

		for (int i=0; i < _japaneseNumbers.length; i++) {
			char numCh = numCharacters.charAt(i);
			_japaneseNumbers[i] = new JapaneseNumber(numCh);
		}
	}

}
