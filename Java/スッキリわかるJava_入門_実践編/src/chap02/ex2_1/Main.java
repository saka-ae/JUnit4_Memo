package chap02.ex2_1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		SimpleDateFormat format = new SimpleDateFormat("西暦yyyy年MM月dd日");

		Date now = new Date();
		printDate(now, format);

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(now);

		int day		= calendar.get(Calendar.DAY_OF_MONTH);
		int futureDay	= day + 100;
		calendar.set(Calendar.DAY_OF_MONTH, futureDay);

		Date future = calendar.getTime();
		printDate(future, format);
	}


	private static void printDate(Date date, SimpleDateFormat format) {
		String str = format.format(date);
		System.out.println(str);
	}

}
