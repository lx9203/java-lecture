package Test07_16;

import java.util.*;

public class MemberLogin {
	public static void main(String[] args) {
		MemberDAO eDao = new MemberDAO();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("아이디와 비밀번호를 입력하세요");
		System.out.print("아이디 : ");
		int id = Integer.parseInt(scanner.nextLine());
		System.out.print("비밀번호 : ");
		String pw = scanner.nextLine();
		eDao.check(id, pw);
		scanner.close();
	}
}
