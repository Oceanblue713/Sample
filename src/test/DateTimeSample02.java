package test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTimeSample02 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH,10);

		Date month = cal.getTime();
		System.out.println(month);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd");
		String str = sdf.format(month);
		System.out.println(str);

	}

}
