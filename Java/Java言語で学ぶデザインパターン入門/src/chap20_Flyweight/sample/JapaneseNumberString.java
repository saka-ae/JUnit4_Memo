package chap20_Flyweight.sample;

public class JapaneseNumberString {
	private JapaneseNumber[] _japaneseNumbers;


	public JapaneseNumberString(String numCharacters) {
		_japaneseNumbers = new JapaneseNumber[numCharacters.length()];

		JapaneseNumberFactory factory = JapaneseNumberFactory.getInstance();
		for (int i=0; i < _japaneseNumbers.length; i++) {
			char numCh = numCharacters.charAt(i);
			_japaneseNumbers[i] = factory.getJapaneseNumber(numCh);
		}
	}


	public void print() {
		for (JapaneseNumber jNum : _japaneseNumbers)
			jNum.print();
	}

}
