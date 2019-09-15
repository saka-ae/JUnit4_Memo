package chap9_Bridge.sample;

public class StringDisplayImpl implements DisplayImpl {
	private static char PREFIX = '*';
	private static char SUFFIX = '*';

	private String _str;


	public StringDisplayImpl(String str) {
		_str = str;
	}


	@Override
	public void setUp() {
		System.out.print(PREFIX);
	}


	@Override
	public void tearDown() {
		System.out.print(SUFFIX);

		System.out.println();
	}


	@Override
	public void print() {
		System.out.print(_str);
	}

}
