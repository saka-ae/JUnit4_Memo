package chap16.リスト16_02;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		String fileName = "テキスト.txt";

		try (FileWriter fw = new FileWriter(fileName)) {
			fw.write('a');
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
