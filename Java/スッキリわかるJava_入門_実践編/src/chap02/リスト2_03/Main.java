package chap02.リスト2_03;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {

	public static void main(String[] args) {
		LocalDateTime past	= LocalDateTime.of(2000, 1, 2, 10, 11, 12);

		LocalDateTime now	= LocalDateTime.now();

		ZoneId zone = ZoneId.of("Asia/Tokyo");
		ZonedDateTime zonedDateTime = now.atZone(zone);
		System.out.println(zonedDateTime);

		LocalDateTime dateTime = zonedDateTime.toLocalDateTime();
		System.out.println(dateTime);
	}

}
