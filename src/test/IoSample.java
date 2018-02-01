package test;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class IoSample {

	public static void main(String[] args) throws IOException{

		String file = "test01.txt";
		Writer out = new FileWriter(file);

		out.write("test");
		out.write("だよ");
		out.close();
		System.out.println("ファイル処理終了");


	}

}
