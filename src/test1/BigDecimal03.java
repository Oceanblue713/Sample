package test1;

import java.math.BigDecimal;

public class BigDecimal03 {

        public static void main(String[] args) {
        	BigDecimal num1 = new BigDecimal("12.34");
        	BigDecimal num2 = new BigDecimal("34.567");

        	BigDecimal rectangle = getSquareArea(num1,num2);
        	System.out.println("面積:" + rectangle);

        }

        public static BigDecimal getSquareArea(BigDecimal num1,BigDecimal num2) {
        	BigDecimal rectangle = num1.multiply(num2);
        	return rectangle;
        }
}
