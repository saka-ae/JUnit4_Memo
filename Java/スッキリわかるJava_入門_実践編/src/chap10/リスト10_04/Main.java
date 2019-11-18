package chap10.リスト10_04;

import java.io.FileReader;
import java.io.Reader;
import java.util.Properties;

public class Main {

	public static void main(String[] args) throws Exception {
		String fileName = "rpg.properties";
		Reader fr = new FileReader(fileName);

		Properties prop = new Properties();
		prop.load(fr);

		String name		= prop.getProperty("name");
		String strHp	= prop.getProperty("hp");

		int hp = Integer.parseInt(strHp);
		System.out.printf("%s: %d\n", name, hp);

		fr.close();
	}

}
