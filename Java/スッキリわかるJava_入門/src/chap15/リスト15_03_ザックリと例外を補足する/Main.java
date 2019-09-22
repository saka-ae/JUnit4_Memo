package chap15.リスト15_03_ザックリと例外を補足する;

import java.io.FileReader;

public class Main {

	public static void main(String[] args) {
		String fileName = "テキスト.txt";

		try ( FileReader fr = new FileReader(fileName)) {
			fr.read();
		} catch (Exception e) {
			 e.printStackTrace();
		 }
	}

}
