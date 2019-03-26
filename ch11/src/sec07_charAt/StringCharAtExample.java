package sec07_charAt;

import java.util.*;

public class StringCharAtExample {
	public static void main(String[] args) {
		System.out.print("주민등록 번호 입력 > ");
		Scanner scanner = new Scanner(System.in);
		String ssn = scanner.nextLine();
		

		char sex = ssn.charAt(7);
		switch (sex) {
		case '1' :
		case '3' :
			System.out.println("남자입니다.");
			break;
		case '2' :
		case '4' :
			System.out.println("여자입니다.");
			break;
		}
		scanner.close();
	}
}
