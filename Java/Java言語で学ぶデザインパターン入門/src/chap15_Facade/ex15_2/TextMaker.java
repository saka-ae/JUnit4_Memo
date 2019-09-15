package chap15_Facade.ex15_2;

import java.util.Map;

import chap15_Facade.sample.text_maker.TextWriter;

public class TextMaker {

	public static void makeTitleList(Database database) {
		Map<Integer, String> map = database.getBookMap();

		for (String title : map.values()) {
			TextWriter.write(title);
		}
	}

}
