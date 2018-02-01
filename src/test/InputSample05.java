package test;

import java.util.Scanner;

public class InputSample05 {

	public static void main(String[] args) {

		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("数値の入力です");

		while(true) {
			if (sc.hasNextInt()){
				num = sc.nextInt();
                break;
			}else {
				System.out.println("数値を入力して下さい");
				sc.next();
			}
		}
		System.out.println("入力した数値は" + num);
		sc.close();

	}

}
