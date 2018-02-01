package test1;

import java.math.BigDecimal;

public class Math02 {

	public static void main(String[] args) {

		int people1 = 1;
        BigDecimal price1 = getPrice(people1);

        int people2 = 5;
        BigDecimal price2 = getPrice(people2);

        int people3 = 15;
        BigDecimal price3 = getPrice(people3);

        int people7 = 16;
        BigDecimal price7 = getPrice(people7);

        int people4 = -3;
        BigDecimal price4 = getPrice(people4);

        int people5 = 31;
        BigDecimal price5 = getPrice(people5);

        int people6 = 73;
        BigDecimal price6 = getPrice(people6);

        int people8 = 151;
        BigDecimal price8 = getPrice(people8);
	}

	public static BigDecimal getPrice(int people){

		BigDecimal peopleBig = BigDecimal.valueOf(people);

		BigDecimal sevenfive = new BigDecimal("750");
		BigDecimal total = peopleBig.multiply(sevenfive);


		if ( people <= 0 ){
			System.out.println("人数を入れ直して下さい");
		}else if (people >= 1 && people < 15){

			System.out.println(peopleBig + "人で、合計" + total +"円です。");
			BigDecimal smallave = total.divide(peopleBig);
			System.out.println("一人当たり"+ smallave + "円です。");

		}else{
			BigDecimal discount = new BigDecimal("0.75");
			BigDecimal bigdiscount = total.multiply(discount);
            BigDecimal bigtotal = bigdiscount.setScale( 0, BigDecimal.ROUND_UP);
			System.out.println(peopleBig + "人で、合計" + bigtotal +"円です。");
			BigDecimal bigave = bigdiscount.divide(peopleBig);
			BigDecimal bigavefix = bigave.setScale(0, BigDecimal.ROUND_UP);
			System.out.println("一人当たり"+ bigavefix + "円です。");
		}
		return total;
	}

}

