package test1;

import java.math.BigDecimal;

public class BmiCalculate {

	public static void main(String[] args) {

		System.out.println("BMIが18.5未満は低体重、18.5から25は普通体重、25.1から30は肥満、30.1以上は超肥満とします。");


		BodySize person1 = new BodySize(52.1,1.61);
		BigDecimal bmi1 = getBmi(person1);

		BodySize person2 = new BodySize(60.0,1.43);
		BigDecimal bmi2 = getBmi(person2);

		BodySize person3 = new BodySize(72.5,1.30);
		BigDecimal bmi3 = getBmi(person3);

		BodySize person4 = new BodySize(80.5,1.75);
		BigDecimal bmi4 = getBmi(person4);

		BodySize person5 = new BodySize(0.00,1.45);
		BigDecimal bmi5 = getBmi(person5);

		BodySize person6 = new BodySize(13.4,1.45);
		BigDecimal bmi6 = getBmi(person6);

		BodySize person7 = new BodySize(80.4,1.45);
		BigDecimal bmi7 = getBmi(person7);

		BodySize person8 = new BodySize(59.6,1.54);
		BigDecimal bmi8 = getBmi(person8);

		BodySize person9 = new BodySize(-1.00,-1.45);
		BigDecimal bmi9 = getBmi(person9);

	}

	public static BigDecimal getBmi(BodySize person){

		double weight = person.getWeight();
		double hight = person.getHight();

		if( weight <= 0 || hight <= 0){
			System.out.println("データを正しく入力して下さい。");
		}

		double bmi = weight / (hight*hight);
		BigDecimal bmideci = BigDecimal.valueOf(bmi);
		BigDecimal bmiround = bmideci.setScale(1,BigDecimal.ROUND_HALF_UP);
		System.out.println("あなたのBMIは" + bmiround + "です");

		BigDecimal skinny = new BigDecimal("18.5");
		BigDecimal normal = new BigDecimal("25");
		BigDecimal chubby = new BigDecimal("30");
		BigDecimal obese = new BigDecimal("35");

        if(bmiround.compareTo(BigDecimal.ZERO) <= 0){
        	System.out.println("計算できませんでした");
	    }else if(skinny.compareTo(bmiround) > 0 ){
			System.out.println("あなたは低体重です。");
		}else if(normal.compareTo(bmiround) >= 0){
			System.out.println("あなたは普通体重です。");
		}else if(chubby.compareTo(bmiround) >= 0){
			System.out.println("あなたは肥満です。");
		}else if(obese.compareTo(bmiround) >= 0){
			System.out.println("あなたは超肥満です。");
		}else{
			System.out.println("あなたは超肥満です。");
		}

        return bmiround;

	}

}

