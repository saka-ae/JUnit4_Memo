package chap10.リスト10_05;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Properties;

public class Main {

	public static void main(String[] args) throws Exception {
		String fileName = "rpg.properties";
		Writer fw = new FileWriter(fileName);

		Properties prop = new Properties();
		prop.setProperty("name", "abc");
		prop.setProperty("hp", "99");

		prop.store(fw, "プロパティファイルへの書き込みを実行");

		fw.close();
	}

}
