package test1;

import java.util.Random;
public class RandomMath01 {

	public static void main(String[] args) {

		Random rnd = new Random();

		int ran = rnd.nextInt(101);
		System.out.println(ran);

	}

}
