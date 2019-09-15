package chap12_Decorator.ex12_1;

import chap12_Decorator.sample.Border;
import chap12_Decorator.sample.Display;

public class UpDownBorder extends Border {
	private char _borderCharacter;


	public UpDownBorder(Display display, char borderCharacter) {
		super(display);
		_borderCharacter = borderCharacter;
	}


	@Override
	public String getText() {
		Display display	= super.getDisplay();
		String text			= display.getText();

		String upBorder	= makeBorderLine();
		String downBorder	= upBorder;

		StringBuilder sb = new StringBuilder();
		sb.append(upBorder);
		sb.append(System.lineSeparator());

		sb.append(text);
		sb.append(System.lineSeparator());

		sb.append(downBorder);

		return sb.toString();
	}

	@Override
	public int getLength() {
		Display display	= super.getDisplay();

		return display.getLength();
	}


	private String makeBorderLine() {
		StringBuilder sb = new StringBuilder();

		int length = getLength();
		for (int i=0; i < length; i++)
			sb.append(_borderCharacter);

		return sb.toString();
	}

}
