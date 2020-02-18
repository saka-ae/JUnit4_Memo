package chap11.sample11_03;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 1);
		map.put("B", 2);

		String fileName = "data.ser";

		Save save = new Save();
		save.save(map, fileName);

		Load<Map<String, Integer>> load = new Load<>();
		Map<String, Integer> loadedMap = load.load(fileName);
		
		System.out.println(loadedMap);
	}

}
