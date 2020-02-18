package chap10.sample10_03;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Y2K {

	public static void main(String[] args) {
		Timer timer = new Timer();

		TimerTask task = new TimerTask() {

			@Override
			public void run() {
				System.out.println("Y2K!");
			}

		};

		LocalDate localDate = LocalDate.of(2000, Month.JANUARY, 1);
		ZoneId zoneId = ZoneId.systemDefault();
		ZonedDateTime zonedDate = localDate.atStartOfDay(zoneId);

		Instant instant = zonedDate.toInstant();
		Date date = Date.from(instant);

		timer.schedule(task, date);
	}

}
