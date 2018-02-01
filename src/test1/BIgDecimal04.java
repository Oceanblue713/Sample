package test1;

import java.math.BigDecimal;

public class BIgDecimal04 {

	public static void main(String[] args) {

		BigDecimal pi = new BigDecimal(Math.PI);
		BigDecimal radius = new BigDecimal("4");

		BigDecimal circumFerence = radius.multiply(new BigDecimal(2)).multiply(pi);
		System.out.println("円周:" + circumFerence);

        BigDecimal surfaceArea = radius.multiply(radius).multiply(pi);
        System.out.println("面積:" + surfaceArea);

	}

}
