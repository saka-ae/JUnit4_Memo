package chap02.リスト2_05;

import java.time.LocalDate;
import java.time.Period;

public class Main {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		System.out.println(now);

		int num = 3;
		LocalDate future = now.plusDays(num);
		System.out.println(future);


		Period period1 = Period.ofDays(num);
		LocalDate future1 = now.plus(period1);
		System.out.println(future1);

		//							//	 (begin,	end)
		Period period2 = Period.between(now,		future);
		LocalDate future2 = now.plus(period2);
		System.out.println(future2);

		Period period3 = Period.between(future,	now);
		LocalDate future3 = now.plus(period3);
		System.out.println(future3);
	}

}
