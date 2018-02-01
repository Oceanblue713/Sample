package test1;

public class Math01 {

	public static void main(String[] args) {

		int legs = 48;
		int total = 20;


        if( legs > 2*total && legs > 0 && total > 0 && legs % 2 == 0 ){
		int kame = getKame(legs,total);
		int turu = total - kame;
		System.out.println("亀:" + kame +"匹");
		System.out.println("鶴:" + turu +"匹");
        } else {
        	System.out.println("計算できません");
        }
	}

	public static int getKame(int legs, int total){
		int kame = (legs - ( 2*total))/2;
		return kame;
	}

}
