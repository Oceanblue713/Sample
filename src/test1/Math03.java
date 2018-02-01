package test1;

public class Math03 {

	public static void main(String[] args) {

		int year1 = getYear(1234);
		int year2 = getYear(3000);
		int year3 = getYear(-1);
		int year4 = getYear(1000);
		int year5 = getYear(2000);
		int year6 = getYear(2400);
		int year7 = getYear(2016);
		int year8 = getYear(400);
		int year9 = getYear(4);
		int year10 = getYear(2);
		int year11 = getYear(2017);

	}

	public static int getYear(int year){
		if( year < 0 ){
			System.out.println("西暦を正しく入力して下さい");
		}else if (year % 400 == 0){
			System.out.println(year + "年はうるう年です");
		}else if (year % 100 == 0){
			System.out.println(year + "年は平年です");
		}else if (year % 4 == 0){
			System.out.println(year + "年はうるう年です");
		}else{
			System.out.println(year + "年はうるう年ではありません");
		}
		return year;
	}

}
