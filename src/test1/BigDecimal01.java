package test1;

import java.math.BigDecimal;

public class BigDecimal01 {

	public static void main(String[] args) {
		double num1 = 5.666686992345123344556784567894444444444333321;
		double num2 = Math.sqrt(num1);
		System.out.println(num2);

		BigDecimal result1 = BigDecimal.valueOf(num2);
		System.out.println(result1);

		BigDecimal result2 = result1.setScale(1, BigDecimal.ROUND_HALF_UP);
		System.out.println(result2);

		BigDecimal result3 = result1.setScale(2, BigDecimal.ROUND_HALF_UP);
		System.out.println(result3);

	}
}
