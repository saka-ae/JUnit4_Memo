package chap16.リスト16_01;

import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		String fileName = "テキスト.txt";

		try (FileReader fr = new FileReader(fileName)) {
			char ch = (char) fr.read();
			System.out.println(ch);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
