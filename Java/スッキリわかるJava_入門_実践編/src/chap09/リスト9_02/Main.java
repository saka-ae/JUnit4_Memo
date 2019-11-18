package chap09.リスト9_02;

import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		String fileName = "text.txt";

		FileReader fr = new FileReader(fileName);

		System.out.println("ファイルの内容を表示");

		for (int i = fr.read(); i != -1; i = fr.read()) {
			char ch = (char) i;
			System.out.print(ch);
		}

		fr.close();
	}

}
