
public class IfSample01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int score = 100;
		int a = 50;

		if(score == 100 && a == 100){
			System.out.println("Perfect!!");
		}else if(score >= 60 && score <= 70 || a <= 60){
		    System.out.println("Pass");
		}else{
			System.out.println("Failed");
		}

	}

}
