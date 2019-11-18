package chap02.ex2_2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");

		LocalDate now = LocalDate.now();
		printDate(now, format);

		int days = 100;
		LocalDate future	= now.plusDays(days);
		printDate(future, format);
	}


	private static void printDate(LocalDate date, DateTimeFormatter format) {
		String str = date.format(format);
		System.out.println(str);
	}

}
