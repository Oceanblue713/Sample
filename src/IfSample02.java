
public class IfSample02 {

	public static void main(String[] args) {

		int age = 20;

		if(age < 20){
			System.out.println("あなたはお酒が飲めません。");
		}else if(age >= 20 && age < 30){
			System.out.println("２０代を楽しんでください。");
		}else if(age >= 30 && age < 40){
			System.out.println("飲み過ぎに注意してください。");
		}else{
			System.out.println("貯金頑張ってください。");
		}

	}

}
