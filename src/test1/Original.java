package test1;

import java.util.Scanner;

public class Original {

	public static void main(String[] args) {

		int total1 = 0;
		Scanner sc1 = new Scanner(System.in);
		System.out.println("1人目のお名前は？");
		String name1 = sc1.next();
		char[] ch1 = name1.toCharArray();
		for(int i = 0; i < ch1.length; i++){
		    total1 += ch1[i];
		}

		int total2 = 0;
		Scanner sc2 = new Scanner(System.in);
		System.out.println("2人目のお名前は？");
		String name2 = sc2.next();
		char[] ch2 = name2.toCharArray();
		for(int j = 0; j < ch2.length; j++){
			total2 += ch2[j];
		}

		int total = total1 * total2;
		if (total < 0){
			total *= -1;
		}

		int point = total % 100;
		if( point == 0){
			System.out.println("2人の相性は100段階中100です、最高です");
		}else{
			System.out.println("2人の相性は100段階中" + point + "です");
		}
	}
}
