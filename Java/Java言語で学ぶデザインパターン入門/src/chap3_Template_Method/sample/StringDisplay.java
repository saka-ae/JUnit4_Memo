package chap3_Template_Method.sample;

public class StringDisplay extends AbstractDisplay {
	private String _str;
	private int _width;


	public StringDisplay(String str) {
		_str	= str;
		_width	= str.length();
	}


	@Override
	protected void prefix() {
		printLine();
	}
	@Override
	protected void suffix() {
		printLine();
	}
	private void printLine() {
		final char pre = '+';
		System.out.print(pre);

		for (int i=0; i < _width; i++)
			System.out.print("-");

		final char suf = '+';
		System.out.print(suf);

		System.out.println();
	}

	@Override
	protected void print() {
		final char pre = '|';
		final char suf = '|';

		System.out.format("%c%s%c\n", pre, _str, suf);
	}

}
