package basic04;

import java.util.*;

public class MemberTest {
	public static void main(String[] args) {
		MemberDAO eDao = new MemberDAO();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("아이디와 비밀번호를 입력하세요");
		eDao.check(Integer.parseInt(scanner.nextLine()), scanner.nextLine());
		
		scanner.close();
	} // main
}
