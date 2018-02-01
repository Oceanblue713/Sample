package test1;

public class RandomMath03 {

	public static void main(String[] args) {

		for(int j = 1; j <= 10 ; j++){
			int i = (int)(Math.random()*10)+1;
			System.out.println(i);
		}
	}
}
