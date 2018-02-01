package test;

import java.util.Scanner;

public class InputSample01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("コンソールに何か入力しましょう");
		String testStr = sc.next();
		System.out.println("入力した文字は: " + testStr);
		sc.close();

	}

}
