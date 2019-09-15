package chap12_Decorator.sample;

public class SideBorder extends Border {
	private char _borderCharacter;


	public SideBorder(Display display, char borderChar) {
		super(display);
		_borderCharacter = borderChar;
	}


	@Override
	public String getText() {
		Display display	= super.getDisplay();
		String text			= display.getText();

		return _borderCharacter + text + _borderCharacter;
	}

	@Override
	public int getLength() {
		String text = getText();

		return text.length();
	}

}
