package chap10.ex10_1;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Main {

	public static void main(String[] args) {
		String fileName = "pref.properties";

		String capital;
		String food;

		try (FileReader fr = new FileReader(fileName)) {
			Properties prop = new Properties();
			prop.load(fr);
			capital	= prop.getProperty("aichi.capital");
			food	= prop.getProperty("aichi.food");
		} catch(IOException e) {
			e.printStackTrace();

			return;
		}

		System.out.printf("%s:%s\n", capital, food);
	}

}
