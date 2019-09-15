package chap15_Facade.sample.text_maker;

import java.util.HashMap;
import java.util.Map;

public class Database {
	private Map<String, String> _bookMap;


	public Database() {
		_bookMap = new HashMap<>();
		_bookMap.put("Java言語で学ぶデザインパターン入門", "結城 浩");
	}


	public String getAuthor(String title) {
		return _bookMap.get(title);
	}

}
