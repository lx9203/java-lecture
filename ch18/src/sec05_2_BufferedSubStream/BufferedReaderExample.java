package sec05_2_BufferedSubStream;

import java.io.*;

public class BufferedReaderExample {

	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		
		System.out.print("입력 : ");
		String lineString = br.readLine();
		
		System.out.println("출력 : " + lineString);
	}

}
