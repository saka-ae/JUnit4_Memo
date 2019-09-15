package chap3_Template_Method.sample;

public class CharDisplay extends AbstractDisplay {
	private char _ch;


	public CharDisplay(char ch) {
		_ch = ch;
	}


	@Override
	protected void prefix() {
		System.out.print("<");
	}

	@Override
	protected void suffix() {
		System.out.print(">");
	}

	@Override
	protected void print() {
		System.out.print(_ch);
	}

}
