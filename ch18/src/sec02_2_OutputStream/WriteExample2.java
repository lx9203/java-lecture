package sec02_2_OutputStream;

import java.io.*;

public class WriteExample2 {

	public static void main(String[] args) throws Exception{
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");
		byte[] data = "WriteExample2".getBytes();
		os.write(data);		
		os.flush();
		os.close();
	}

}
