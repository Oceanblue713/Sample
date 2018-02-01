package test1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeApi02 {

	public static void main(String[] args) {

	    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");

	    LocalDate ldt = LocalDate.now();
		System.out.println("今日は " +ldt.format(dtf));

		LocalDate ld = LocalDate.now();
		LocalDate ldhundred = ld.plusDays(100);
		System.out.println("100日後は " + ldhundred.format(dtf));

	}
}
