package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.FileReader;

public class IoSample02 {

	public static void main(String[] args) throws IOException{

		File filePath = new File("test01.txt");
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		String str = br.readLine();

		while (str != null) {
			System.out.println(str);
			str = br.readLine();
		}
		br.close();
	}

}
