package chap11.リスト11_01;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Main {

	public static void main(String[] args) throws IOException {
		String address = "https://www.google.com/";

		URL url = new URL(address);
		InputStream is = url.openStream();

		InputStreamReader isr = new InputStreamReader(is);

		for (int i = isr.read(); i != -1; i = isr.read()) {
			char ch = (char) i;
			System.out.print(ch);
		}

		isr.close();
	}

}
