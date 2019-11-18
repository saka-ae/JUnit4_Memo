package chap02.リスト2_02;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		Instant i1 = Instant.now();

		long num = i1.toEpochMilli();
		Instant i2 = Instant.ofEpochMilli(num);

		ZonedDateTime z1 = ZonedDateTime.now();

		ZoneId zone = ZoneId.of("Asia/Tokyo");
		ZonedDateTime z2 = ZonedDateTime.of(2019, 1, 2, 3, 4, 5, 6, zone);

		Instant i3 = z2.toInstant();
		ZonedDateTime z3 = i3.atZone(zone);

		System.out.println("東京: " + z2.getYear() + z2.getMonthValue() + z2.getDayOfMonth());

		if (z2.isEqual(z3))
			System.out.printf("%s = %s\n", z2, z3);
	}

}
