package test;

import java.math.BigDecimal;

public class JavaLesson7_04 {

	public static void main(String[] args) {

		BigDecimal num1 = new BigDecimal("0.7");
		BigDecimal num2 = new BigDecimal("0.11");
		BigDecimal result = num1.add(num2);
		System.out.println(result);

		result = num1.subtract(num2);
		System.out.println(result);

		result = num1.multiply(num2);
		System.out.println(result);

		result = num1.remainder(num2);
		System.out.println(result);


	}

}
