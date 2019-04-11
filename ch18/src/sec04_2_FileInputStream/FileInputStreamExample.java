package sec04_2_FileInputStream;

import java.io.*;

public class FileInputStreamExample {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("D:\\seong\\java-lecture\\ch18\\src\\sec04_2_FileInputStream/FileInputStreamExample.java");
			int data;
			while ((data = fis.read()) != -1){
				System.out.write(data);
			}
			fis.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
