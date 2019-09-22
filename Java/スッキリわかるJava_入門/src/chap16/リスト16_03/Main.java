package chap16.リスト16_03;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String urlStr = "http://www.impressjapan.jp/";

		URL url;
		try {
			url = new URL(urlStr);
		} catch (MalformedURLException e) {
			e.printStackTrace();
			return;
		}

		try (InputStream is = url.openStream()) {
			Scanner sc = new Scanner(is);
			while (sc.hasNext()) {
				String line = sc.nextLine();
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
