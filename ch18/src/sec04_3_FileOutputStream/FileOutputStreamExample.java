package sec04_3_FileOutputStream;

import java.io.*;

public class FileOutputStreamExample {

	public static void main(String[] args) throws Exception {
		String originalFileName = "C:\\Temp/dog.png";
		String targetFileName = "C:/Temp/dogdog.png";
		
		FileInputStream fis = new FileInputStream(originalFileName);
		FileOutputStream fos = new FileOutputStream(targetFileName);
		
		int readByteNo;
		byte[] readBytes = new byte[100];
		while( (readByteNo = fis.read(readBytes)) != -1) {
			fos.write(readBytes, 0, readByteNo);
		}
		
		fos.flush();
		fos.close();
		fis.close();
		
		System.out.println("복사가 완료되었습니다.");
	}

}
