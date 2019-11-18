package chap09.リスト9_03;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		String fileName = "text.txt";

		FileOutputStream fos = new FileOutputStream(fileName, true);
		fos.write(65);
		fos.flush();
		fos.close();
	}

}
