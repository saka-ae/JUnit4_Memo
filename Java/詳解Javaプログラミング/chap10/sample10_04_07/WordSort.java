package chap10.sample10_04_07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WordSort {

	public static void main(String[] args) {
		String fileName = "text.txt";
		Map<String, Integer> map = new TreeMap<>();

		try (
				FileReader fr		= new FileReader(fileName);
				BufferedReader br	= new BufferedReader(fr)
		) {
			for (String line = br.readLine(); line != null; line = br.readLine()) {
				Scanner sc = new Scanner(line);

				while (sc.hasNext()) {
					String word = sc.next().toLowerCase();

					if (map.containsKey(word)) {
						int cnt = map.get(word);
						cnt++;

						map.put(word, cnt);
					} else
						map.put(word, 1);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (String word : map.keySet()) {
			int cnt = map.get(word);

			System.out.printf("%s: %d\n", word, cnt);
		}
	}

}
