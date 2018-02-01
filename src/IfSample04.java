
public class IfSample04 {

	public static void main(String[] args) {
		String place = "中国";

		if(place.equals("北海道")) {
			System.out.println(place + "への送料は1,000円です");
		}else if(place.equals("東北")) {
			System.out.println(place + "への送料は800円です");
		}else if(place.equals("関東")){
			System.out.println(place + "への送料は700円です");
		}else if(place.equals("甲信越")){
			System.out.println(place + "への送料は700円です");
		}else if(place.equals("中部")){
			System.out.println(place + "への送料は650円です");
		}else if(place.equals("近畿")){
			System.out.println(place + "への送料は600円です");
		}else if(place.equals("四国")){
			System.out.println(place + "への送料は700円です");
		}else if(place.equals("中国")){
			System.out.println(place + "への送料は800円です");
		}else if(place.equals("九州")){
			System.out.println(place + "への送料は950円です");
		}else if(place.equals("沖縄")){
			System.out.println(place + "への送料は950円です");
		}else{
			System.out.println("入力データエラーです");
		}

	}

}
