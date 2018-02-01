package test3;

public class Result {

	public static void main(String[] args) {
		Data dat1 = new Data(2, 39);
		int date1 = getResult(dat1);
	}

	public static int getResult(Data dat){
		int num1 = dat.getNum1();
		int num2 = dat.getNum2();
		int result = num1 * num2;
		
		if( result >= 100){
			System.out.println("今日はいいことあるかもね");
		}else if (result < 100 && result > 50){
			System.out.println("まあまあな１日です");
		}else{
			System.out.println("今日も頑張れ");
		}

		return result;
	}

}
