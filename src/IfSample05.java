
public class IfSample05 {

	public static void main(String[] args) {
		int distance = 300;

		if(distance > 0 && distance < 100){
			System.out.println(distance + "キロ先に荷物を送るための送料は600円です");
		}else if(distance >= 100 && distance < 250){
			System.out.println(distance + "キロ先に荷物を送るための送料は800円です");
		}else if(distance >= 250 && distance < 500){
			System.out.println(distance + "キロ先に荷物を送るための送料は900円です");
		}else if(distance >= 500){
			System.out.println(distance + "キロ先に荷物を送るための送料は1200円です");
		}else{
			System.out.println("入力データエラーです");
		}

	}

}
