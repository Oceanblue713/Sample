package test1;

import java.util.Scanner;

public class Matching {

	public static void main(String[] args) {

        int total1 = 0;

		Scanner sc1 = new Scanner(System.in);
		System.out.println("1人目のお名前は？");
		String name1 = sc1.next();
		byte[] bytes1 = name1.getBytes();
		for(int i = 0; i < bytes1.length;i++){
		    total1 += bytes1[i];
		}

		int total2 = 0;
        Scanner sc2 = new Scanner(System.in);
		System.out.println("2人目のお名前は？");
        String name2 = sc2.next();
		byte[] bytes2 = name2.getBytes();
		for(int j = 0; j < bytes2.length; j++){
			total2 += bytes2[j];
		}

		int total = total1 + total2;
		if (total < 0){
			total *= -1;
		}

		int point = total % 10;
		if( point == 0){
			System.out.println("2人の相性は10段階中10です、最高です");
		}else{
			System.out.println("2人の相性は10段階中" + point + "です");
		}
	}
}
