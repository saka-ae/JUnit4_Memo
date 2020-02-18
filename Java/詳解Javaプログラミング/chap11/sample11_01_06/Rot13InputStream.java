package chap11.sample11_01_06;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Rot13InputStream extends FilterInputStream {

	public Rot13InputStream(InputStream is) {
		super(is);
	}

	@Override
	public int read() {
		int result;

		try {
			int ch = super.in.read();

			result = rot13(ch);
		} catch (IOException e) {
			e.printStackTrace();

			return -1;
		}

		return result;
	}

	private int rot13(int ch) {
		int result = ch;

		if (Character.isUpperCase(ch)) {
			result = rotate13(ch, 'A');
		} else if (Character.isLowerCase(ch))
			result = rotate13(ch, 'a');
		else
			result = ch;

		return result;
	}

	private int rotate13(int ch, char standardPositionCharacter) {
		int initPosition	= ch - standardPositionCharacter;
		int position		= (initPosition + 13) % 26;

		return standardPositionCharacter + position;
	}

}
