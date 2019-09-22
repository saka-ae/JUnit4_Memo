package chap14.ex14_1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Date now = new Date();

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(now);

		int oldDay = calendar.get(Calendar.DAY_OF_YEAR);

		int newDay = oldDay + 100;
		calendar.set(Calendar.DAY_OF_YEAR, newDay);

		Date newDate = calendar.getTime();

		SimpleDateFormat format = new SimpleDateFormat("西暦yyyy年MM月dd日");
		String str = format.format(newDate);

		System.out.println(str);
	}

}
