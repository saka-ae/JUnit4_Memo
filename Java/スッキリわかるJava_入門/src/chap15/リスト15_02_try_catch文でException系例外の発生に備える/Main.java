package chap15.リスト15_02_try_catch文でException系例外の発生に備える;

import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		String fileName = "テキスト.txt";

		try ( FileReader fr = new FileReader(fileName)) {
			;
		} catch (IOException e) {
			 e.printStackTrace();
		 }
	}

}
