package basic05;

import java.util.*;

public class BbsTest {
	public static void main(String[] args) {
		BbsDAO eDao = new BbsDAO();
		Scanner scanner = new Scanner(System.in);


		
		
//		System.out.println("제목, 내용 순으로 입력하세요.");
//		System.out.print("제목 > ");
//		String t = scanner.nextLine();
//		System.out.print("내용 > ");
//		String c = scanner.nextLine();
//		System.out.print("id > ");
//		String i = scanner.nextLine();
//		eDao.insertBbs(new BbsDTO(t, c, i));
//		System.out.println("등록되었습니다.");
		
//		상세조회
//		System.out.println("검색할 이름을 입력하세요.");
//		System.out.print("> ");
//		String id = scanner.nextLine();
//		System.out.println(eDao.selectMemberId(id).toString());
		
//		로그인
//		System.out.println("아이디와 비밀번호를 입력하세요");
//		eDao.check(Integer.parseInt(scanner.nextLine()), scanner.nextLine());
		
		scanner.close();
	}
}
