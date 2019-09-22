package chap14.リスト14_03;

import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// Date → Calendar
		Date now = new Date();

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(now);

		int year = calendar.get(Calendar.YEAR);
		System.out.println("年: " + year);

		// Calendar → Date
		calendar.set(1999, 11, 31, 11, 59, 59);
		Date dateTime1 = calendar.getTime();
		System.out.println(dateTime1);

		calendar.set(Calendar.YEAR, 2100);
		Date dateTime2 = calendar.getTime();
		System.out.println(dateTime2);
	}

}
