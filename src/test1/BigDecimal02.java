package test1;

import java.math.BigDecimal;

public class BigDecimal02 {

	public static void main(String[] args) {
       BigDecimal num1 = new BigDecimal("12.34");
       BigDecimal num2 = new BigDecimal("34.567");

       BigDecimal rectangle = num1.multiply(num2);
       System.out.println("面積:" + rectangle);

       BigDecimal result = rectangle.setScale(1, BigDecimal.ROUND_HALF_UP);
       System.out.println("面積:" + result);

	}

}
