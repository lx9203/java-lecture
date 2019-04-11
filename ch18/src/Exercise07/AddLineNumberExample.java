package Exercise07;

import java.io.*;

public class AddLineNumberExample {
	public static void main(String[] args) throws Exception {
		String filePath = "D:\\seong\\java-lecture\\ch18\\src\\sec05_2_BufferedSubStream\\BufferedReaderExample.java";
		
		File file = new File(filePath);
		FileReader filereader = new FileReader(file);
		BufferedReader br = new BufferedReader(filereader);
		String line = "";
		int i=1;
		while((line = br.readLine())!= null) {
			System.out.println(i+": "+line);
			i++;
		}
		br.close();
	}
}
