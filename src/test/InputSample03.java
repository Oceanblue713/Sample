package test;

import java.util.Scanner;

public class InputSample03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("数値の入力です");

	    while(sc.hasNext()){
	    	int num = sc.nextInt();
	    	System.out.println("入力した数値は" + num);
	    }
	    sc.close();

	}

}
