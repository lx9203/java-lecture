package sec02_1_InputStream;

import java.io.*;

public class ReadExample2 {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/Temp/test.txt");
		int readByteNo;
		byte[] readBytes = new byte[3];
		String data = "";
		while (true) {
			readByteNo = is.read(readBytes);
			System.out.println(readByteNo);
			if(readByteNo == -1) break;
			data += new String(readBytes, 0, readByteNo);
		}
		System.out.println(data);
		is.close();
	}

}
