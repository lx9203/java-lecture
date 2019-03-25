package sec02;

import java.io.*;
import java.io.FileWriter;
import java.io.IOException;

public class GeneralExceptionExample {

	public static void main(String[] args) {
		String path = "D:\\seong\\java-lecture\\ch10\\src\\sec02\\GeneralExceptionExample.java";
		try {
			File file = new File(path);
			FileWriter fw = new FileWriter(file, true);
			fw.write("A quick brown fox");
			fw.flush();

			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
