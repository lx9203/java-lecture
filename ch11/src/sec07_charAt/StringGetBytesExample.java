package sec07_charAt;

import java.io.*;

public class StringGetBytesExample {
	public static void main(String[] args) {
		String str = "안녕하세요";
		
		byte[] bytes1 = str.getBytes();
		System.out.println("byte1.length : " +  bytes1.length);
		String str1 = new String(bytes1);
		System.out.println("bytes1 -> String : " + str1);
		
		try {
			byte[] byte2 = str.getBytes("EUC-KR");
			System.out.println("byte2.length : " + byte2.length);
			String str2 = new String(byte2, "EUC-KR");
			System.out.println("byte2 -> String : " + str2);
			
			byte[] byte3 = str.getBytes("UTF-8");
			System.out.println("byte3.length : " + byte3.length);
			String str3 = new String(byte3, "UTF-8");
			System.out.println("byte3 -> String : " + str3);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
