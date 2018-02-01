
public class ArraySample03 {

	public static void main(String[] args) {
		String str[] = new String[100];

		for(int i = 1; i <=100; i++){
			str[i-1] = String.valueOf(i);
		}

		for(int j =1; j <= str.length; j++){
			System.out.println(str[j-1]);
		}

	}
}
