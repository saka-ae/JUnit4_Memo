package chap02.リスト2_04;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");

		LocalDate date = LocalDate.parse("2000/01/02", fmt);
		System.out.println(date);
		
		
		LocalDate now = LocalDate.now();
		
		int num = 100;
		LocalDate future = now.plusDays(num);
		
		String str = future.format(fmt);
		System.out.printf("%d日後は%s\n", num, str);
		
		
		if (future.isAfter(now))
			System.out.printf("%sは%sより新しい\n", future, now);
	}

}
