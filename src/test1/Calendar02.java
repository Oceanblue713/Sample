package test1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calendar02 {

	public static void main(String[] args) {

		Date date = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String today = sdf.format(date);
		System.out.println("今日は " + today);

		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE,100);
        Date gethundred = cal.getTime();
        SimpleDateFormat formathundred = new SimpleDateFormat("yyyy/MM/dd");
        String hundred = formathundred.format(gethundred);
        System.out.println("100日後は " + hundred);
	}

}
