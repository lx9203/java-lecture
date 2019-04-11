package sec02_3_Reader;

import java.io.*;

public class ReaderExample3 {

	public static void main(String[] args) throws Exception{
		Reader reader = new FileReader("C:/Temp/Test.txt");
		int readCharNo;
		char[] cbuf = new char[4];
		readCharNo = reader.read(cbuf, 1, 2);
		System.out.println(readCharNo);
		for (int i = 0; i < cbuf.length; i++) {
			System.out.println(cbuf[i]);
		}
		reader.close();
	}

}
