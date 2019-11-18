package chap09.リスト9_01;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		String fileName = "text.txt";

		FileWriter fw = new FileWriter(fileName, true);
		fw.write('A');
		fw.flush();
		fw.close();
	}

}
