package test;

import java.util.Scanner;

public class InputSample02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("繰り返しの入力です");

		while(sc.hasNext()){
			String testStr = sc.next();
			System.out.println("入力した文字は" + testStr);
		}

		sc.close();
	}

}
