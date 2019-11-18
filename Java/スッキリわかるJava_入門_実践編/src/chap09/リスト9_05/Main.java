package chap09.リスト9_05;

import java.io.IOException;
import java.io.StringReader;

public class Main {

	public static void main(String[] args) {
		String str = "abc";
		StringReader sr = new StringReader(str);

		try {
			for (int i = sr.read(); i != -1; i = sr.read()) {
				char ch = (char) i;
				System.out.println(ch);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
