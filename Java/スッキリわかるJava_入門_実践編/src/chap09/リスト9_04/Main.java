package chap09.リスト9_04;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		String fileName = "text.txt";

		FileWriter fw = null;

		try {
			fw = new FileWriter(fileName, true);
			fw.write('A');
			fw.flush();
		} catch (IOException e) {
			System.err.println("書き込みエラー");
		} finally {
			try {
				fw.close();
			} catch (IOException e) { }
		}
	}

}
