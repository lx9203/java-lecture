package sec02_4_Writer;

import java.io.*;

public class WriteExample3 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/Temp/test.txt");
		char[] data = "홍길동전".toCharArray();
		writer.write(data, 1, 2);
		writer.flush();
		writer.close();
	}

}
