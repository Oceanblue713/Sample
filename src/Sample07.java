
public class Sample07 {

	public static void main(String[] args) {
		    double num1 = 100;

		    double result1;
		    result1 = tax(num1);
		    System.out.println(num1 + "円の商品の税込み価格は" + num1*1.08 +"円（消費税は" + result1+ "円）です。");
	}

	public static double tax(double num1) {
            double result1 = num1 * 0.08;
            return result1;
	}

}
