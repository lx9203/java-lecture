package sec04_4_FileReader;

import java.io.*;

public class FileReaderExample {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("D:\\seong\\java-lecture\\ch18\\src\\sec04_4_FileReader/FileReaderExample.java");
		
		int readCharNo;
		char[] cbuf = new char[100];
		while((readCharNo = fr.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.println(data);
		}
		fr.close();
	}
}
