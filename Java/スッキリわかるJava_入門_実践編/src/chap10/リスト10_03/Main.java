package chap10.リスト10_03;

import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		String str = "a,b,c";

		StringTokenizer st = new StringTokenizer(str, ",");
		while (st.hasMoreTokens()) {
			String s = st.nextToken();

			System.out.println(s);
		}
	}

}
