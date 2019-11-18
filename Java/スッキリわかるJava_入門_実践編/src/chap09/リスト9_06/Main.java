package chap09.リスト9_06;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();

		try {
			baos.write(65);
			baos.write(66);
			baos.flush();

			byte[] data = baos.toByteArray();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
