package chap11.ex11_1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Main {

	public static void main(String[] args) throws IOException {
		String address	= "http://dokojava.jp/favicon.ico";

		URL url = new URL(address);
		InputStream is = url.openStream();

		String fileName	= "dj.ico";
		FileOutputStream fos = new FileOutputStream(fileName);

		for (int i = is.read(); i != -1; i = is.read()) {
			byte b = (byte) i;
			fos.write(b);
		}

		fos.flush();

		is.close();
		fos.close();
	}

}
