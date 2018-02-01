
public class ForWhileSample02 {

	public static void main(String[] args) {

        System.out.print("        1  2  3  4  5  6  7  8  9");
		System.out.print("\n");

		for(int i = 1; i <= 9; i++) {
			System.out.print(i + "の段  ");
            for(int j = 1; j <= 9; j++) {
                System.out.printf(" %2d", + i*j);
            }
            System.out.println();
        }
	}
}
