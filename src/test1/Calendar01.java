package test1;

import java.util.Calendar;
import java.util.Date;

public class Calendar01 {

	public static void main(String[] args) {
           String[] week_name = {"日曜日","月曜日","火曜日","水曜日","木曜日","金曜日","土曜日"};

           Date date = new Date();
           System.out.println("今日は" +date + "、");

           Calendar cal = Calendar.getInstance();
           int today = cal.get(Calendar.DAY_OF_WEEK) -1;
           System.out.println(week_name[today] + "です");
           if(today == 1 || today == 2 || today == 3 || today == 4 || today == 5){
           System.out.println("お仕事頑張りましょう");
           } else {
        	   System.out.println("今日はお休みです");
           }
	}

}
