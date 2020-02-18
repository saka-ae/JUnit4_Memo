package chap11.sample11_01_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		try (
				InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(isr);
		) {
			String str = br.readLine();

			int num = Integer.parseInt(str);
			System.out.println(num);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
