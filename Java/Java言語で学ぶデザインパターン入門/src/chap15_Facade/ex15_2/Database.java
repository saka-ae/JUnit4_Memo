package chap15_Facade.ex15_2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Database {
	private Map<Integer, String> _bookMap;


	public Database() {
		_bookMap = new HashMap<>();
		_bookMap.put(1, "title1");
		_bookMap.put(2, "title2");
		_bookMap.put(3, "title3");
	}


	public Map<Integer, String> getBookMap() {
		return Collections.unmodifiableMap(_bookMap);
	}

}
