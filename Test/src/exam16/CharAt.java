package exam16;

import java.text.*;
import java.util.*;
import java.util.regex.*;

public class CharAt {

	public static void main(String[] args) {
		SimpleDateFormat format = new SimpleDateFormat ( "yyyy년 MM월dd일 (E), ");
		Date time = new Date();
		String time2 = format.format(time);
		
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("입력 : ");
			String ssn = scanner.nextLine();

			String regExp = "\\d{2}[0-1]\\d[0-3]\\d-?[1-4]";
			boolean result = Pattern.matches(regExp, ssn);
			if (result == true) {
				char sex = ssn.charAt(7);
				switch (sex) {
				case '1':
				case '3':
					System.out.println(time2 + "남자");
					break;
				case '2':
				case '4':
					System.out.println(time2 + "여자");
					break;
				}
			} else {
				System.out.println("정규식과 일치하지 않습니다.");
				continue;
			}
		}
	}
}
