
public class IfSample03 {

	public static void main(String[] args) {
		int weight = 8;

		if(weight > 0 && weight < 1 ){
            System.out.println("この荷物の重さは" + weight + "キロで送料は250円です");
		}else if (weight >= 1 && weight < 3) {
			System.out.println("この荷物の重さは" + weight + "キロで送料は400円です");
		}else if (weight >= 3 && weight < 5){
			System.out.println("この荷物の重さは" + weight + "キロで送料は500円です");
	    }else if (weight >= 5 && weight < 10) {
	    	System.out.println("この荷物の重さは" + weight + "キロで送料は900円です");
	    }else if (weight >= 10){
	    	System.out.println("この荷物の重さは" + weight + "キロで送料は1200円です");
	    }else{
	    	System.out.println("入力データエラーです");
	    }

	}

}
