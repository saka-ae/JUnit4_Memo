package chap12_Decorator.sample;

public class StringDisplay extends Display {
	private String _str;


	public StringDisplay(String str) {
		_str = str;
	}


	@Override
	public String getText() {
		return _str;
	}

	@Override
	public int getLength() {
		return _str.length();
	}

}
