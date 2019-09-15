package chap12_Decorator.ex12_2;

public class MultiSideBorder extends MultiBorder {
	private char _borderCharacter;


	public MultiSideBorder(MultiDisplay display, char borderChar) {
		super(display);
		_borderCharacter = borderChar;
	}


	@Override
	public String getRowText(int row) {
		StringBuilder sb = new StringBuilder();

		MultiDisplay display = super.getDisplay();
		String text	= display.getRowText(row);
		int length	= display.getColumns();

		sb.append(_borderCharacter);

		sb.append(text);
		String spaces = fillSpaces(text, display);
		sb.append(spaces);

		sb.append(_borderCharacter);

		return sb.toString();
	}

	@Override
	public int getColumns() {
		MultiDisplay display = super.getDisplay();

		return display.getColumns() + 2;
	}

	@Override
	public int getRows() {
		MultiDisplay display = super.getDisplay();

		return display.getRows();
	}


	private String fillSpaces(String str, MultiDisplay disp) {
		int length = str.length();
		int spaces = disp.getColumns() - length;

		if (spaces == 0)
			return "";

		StringBuilder sb = new StringBuilder();

		for (int i=0; i < spaces; i++)
			sb.append(' ');

		return sb.toString();
	}

}
