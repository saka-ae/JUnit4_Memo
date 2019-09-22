package chap14.リスト14_04;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws Exception {
		// Date → String
		Date now = new Date();

		SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日 HH時mm分ss秒");
		String str = format.format(now);
		System.out.println(str);

		// String → Date
		Date dateTime = format.parse("1999年11月31日 23時59分59秒");
		System.out.println(dateTime);
	}

}
