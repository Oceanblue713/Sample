package test1;

public class RandomMath04 {

	public static void main(String[] args) {

		int k =0;

		for(int i = 1; i <= 10; i ++){
			int j = (int)(Math.random()*6)+1;
			System.out.println((i + "回目=>" + j));
            k += j;
		}
		System.out.println("Total=>" + k);

	}

}
