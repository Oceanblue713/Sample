package test;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

public class DateTimeSample01 {

	public static void main(String[] args) {

		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);

		OffsetDateTime odt = OffsetDateTime.now();
		System.out.println(odt);

		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(zdt);

		Date date = new Date();
		System.out.println(date);

		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.WEEK_OF_MONTH,1);
		Date nextWeek = cal.getTime();
		System.out.println(nextWeek);

	}

}
