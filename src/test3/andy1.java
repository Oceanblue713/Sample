package test3;

import java.math.BigDecimal;

public class andy1 {


	public static void main(String[] args) {
		 double num1 = 2.345;
		 double num2 = Math.sqrt(num1);
		     System.out.println(num2);

		BigDecimal big1 = BigDecimal.valueOf(num2);
		       System.out.println(big1);

		BigDecimal big2 = big1.setScale(1,BigDecimal.ROUND_UP);
		System.out.println(big2);

		int num3 = 23456654;
		int num4 = num3%13;
		System.out.println(num4);

		BigDecimal big3 = BigDecimal.valueOf(num4);
		System.out.println(big3);

		BigDecimal big4 = big3.setScale(2,BigDecimal.ROUND_DOWN);
		System.out.println(big4);
	}
}

