package sec02_1_InputStream;

import java.io.*;

public class ReadExample1 {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/Temp\\test.txt");
		int readByte;					//     "/"와 "\\"가 섞여도 작동한다
		while (true) {
			readByte = is.read();
			if(readByte == -1) break;
			System.out.print((char) readByte);
			System.out.print("("+ readByte + ") ");
		}
		is.close();
	}

}
