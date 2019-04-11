package sec02_3_Reader;

import java.io.*;

public class ReaderExample1 {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:/Temp/test.txt");
		int readData;
		while(true) {
			readData = reader.read();
			if(readData == -1) {
				break;
			}
			System.out.println((char)readData);
		}
		reader.close();
	}

}
