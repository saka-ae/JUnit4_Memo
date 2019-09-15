package chap20_Flyweight.sample;

public class JapaneseNumber {
	private char _japaneseNumberCharacter;


	public JapaneseNumber(char numCharacter) {
		switch (numCharacter) {
			case '1':
				_japaneseNumberCharacter = '一';
				break;
			case '2':
				_japaneseNumberCharacter = '二';
				break;
			case '3':
				_japaneseNumberCharacter = '三';
				break;
			case '4':
				_japaneseNumberCharacter = '四';
				break;
			case '5':
				_japaneseNumberCharacter = '五';
				break;
			case '6':
				_japaneseNumberCharacter = '六';
				break;
			case '7':
				_japaneseNumberCharacter = '七';
				break;
			case '8':
				_japaneseNumberCharacter = '八';
				break;
			case '9':
				_japaneseNumberCharacter = '九';
				break;
			case '0':
				_japaneseNumberCharacter = '零';
				break;
			default:
				_japaneseNumberCharacter = '？';
		}
	}


	public void print() {
		System.out.print(_japaneseNumberCharacter);
	}

}
