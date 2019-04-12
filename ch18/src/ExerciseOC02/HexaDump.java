package ExerciseOC02;

import java.io.*;
import java.util.*;

public class HexaDump {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		// System.out.print("찾을 파일명 :");
		String fileName = scanner.nextLine();
		// D:\seong\java-lecture\ch18\bin\sec05_1_SubStream\InputStreamReaderExample.class
		scanner.close();
		FileInputStream fis = new FileInputStream(fileName);
		BufferedInputStream bis = new BufferedInputStream(fis);
		int data;
		String text = "";
		int i = 1;

		System.out.printf("%08X :", i-1);
		while ((data = bis.read()) != -1) {
			System.out.printf("%02X ", data);
			if (data >= 32 && data <= 126) {
				text += (char) data;
			} else
				text += ".";

			if (i % 16 == 0) {

				System.out.print(text);
				text = "";
				System.out.println();
				System.out.printf("%08X :", i);
			}

			i++;
		}
		if(16-i > 0) {
			while(true) {
				System.out.print("\t");
			}
		}
		
		System.out.print(text);
		text = "";

		bis.close();
		fis.close();
	}

}
