package chap03.リスト3_07;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Map<String, Integer> prefs = new HashMap<>();
		prefs.put("京都", 255);
		prefs.put("東京", 1261);

		int tokyo = prefs.get("東京");
		System.out.println(tokyo);
		
		prefs.remove("京都");
		
		prefs.put("東京", 1262);
		
		for (String key : prefs.keySet()) {
			Integer val = prefs.get(key);
			System.out.println(val);
		}
	}

}
