package test1;

import java.util.Calendar;

public class Calendar03 {

	public static void main(String[] args) {

		Calendar calendar =Calendar.getInstance();

		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		System.out.println("現在、" + hour + "時です");

		if( hour >= 0 && hour < 5){
			System.out.println("現在は深夜です");
		}else if( hour >= 5 && hour < 10){
			System.out.println("おはようございます");
		}else if( hour >= 10 && hour < 11){
			System.out.println("今日も頑張りましょう");
		}else if( hour >= 11 && hour < 13 ){
			System.out.println("昼食の時間です");
		}else if( hour >= 13 && hour < 17){
			System.out.println("こんにちは" );
		}else if ( hour >= 17 && hour <21){
			System.out.println("こんばんは");
		}else
			System.out.println("おやすみなさい");
		}
	}

