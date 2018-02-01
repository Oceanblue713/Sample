package test1;

import java.time.DayOfWeek;
import java.time.ZonedDateTime;

public class DateTimeApi01 {

	public static void main(String[] args) {

		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println("現在の時刻は" + zdt + "です。");
		DayOfWeek today = zdt.getDayOfWeek();
		System.out.println("今日は" + today + "です");
		if (today == DayOfWeek.SATURDAY || today == DayOfWeek.SUNDAY){
			System.out.println("今日はお休みです");
		}else{
			System.out.println("お仕事頑張りましょう");
		}
	}

}
