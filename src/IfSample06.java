
public class IfSample06 {

	public static void main(String[] args) {
		String mytype= "A";
		String type2 = "A";
		int age = 27;

		if(mytype.equals(type2)){
            System.out.println("あなたの思い通りに物事が進みそうです");
		}else{
			System.out.println("余裕を持った行動を心がけて");
		}

		if(type2.equals("A")){
        	System.out.println("ゆったりとした気分で過ごせそう。");
        }else if(type2.equals("B")){
        	System.out.println("なりたい自分を思い描いて");
        }else if(type2.equals("O")){
        	System.out.println("情報収集が吉");
        }else if(type2.equals("AB")){
        	System.out.println("本当に大切なものが見えてきそう");
        }else{
        	System.out.println("");
        }

		if(mytype.equals(type2)){
            if(age >= 20 && age < 30) {
            	System.out.println("20代:人との心の距離に気をつけて");
            }else if(age >= 0 && age < 20){
            	System.out.println("20代以外:短所も長所に変えられます");
            }else if(age >= 30){
            	System.out.println("20代以外:短所も長所に変えられます");
            }else{
            	System.out.println("");
            }
		}else{
			System.out.println("");
		}

	}
}
