package sec02_3_Reader;

import java.io.*;

public class ReaderExample2 {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:/Temp/test.txt");
		int readCharNo;
		char[] cbuf = new char[4];
		String data = "";
		while(true) {
			readCharNo = reader.read(cbuf);
			System.out.println(readCharNo);
			if(readCharNo == -1) break;
			data += new String(cbuf, 0, readCharNo);
		}
		System.out.println(data);
		reader.close();
	}

}
