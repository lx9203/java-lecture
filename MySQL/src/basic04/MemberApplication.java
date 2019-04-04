package basic04;

import java.util.*;

public class MemberApplication {
	public static void main(String[] args) {
		MemberDAO eDao = new MemberDAO();
		boolean run = true;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("┌-------------------------------------------------------------------------------┐");
			System.out.println("| 1. 회원가입 | 2. 전체조회 | 3. 변경 | 4. 삭제 | 5. 검색 | 6. 로그인 | 7. 종료 |");
			System.out.println("└-------------------------------------------------------------------------------┘");
			System.out.print("선택 >");

			String keyCode = scanner.nextLine();
			if (keyCode.equals("1")) { // 1. 회원가입 O
				System.out.println("패스워드(최대 10자), 이름, 생일, 주소 순으로 입력하세요.");
				System.out.print("입력 > ");
				eDao.insertMember(
						new MemberDTO(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
				System.out.println("등록되었습니다.");
			} else if (keyCode.equals("2")) { // 2. 전체조회
				List<MemberDTO> list = eDao.selectMemberAll();
				for (MemberDTO member : list)
					System.out.println(member.toString());
			} else if (keyCode.equals("3")) { // 3. 변경
				MemberDTO member = eDao.selectMemberOne(100006);
				System.out.println(member.toString());
				System.out.println("변경할 패스워드");
				System.out.print(" > ");
				member.setPassword(scanner.nextLine());
				System.out.println("변경할 이름");
				System.out.print(" > ");
				member.setName(scanner.nextLine());
				System.out.println("변경할 생일");
				System.out.print(" > ");
				member.setBirthday(scanner.nextLine());
				System.out.println("변경할 주소");
				System.out.print(" > ");
				member.setAddress(scanner.nextLine());
				eDao.updateMember(member);
				System.out.println(member.toString());
			} else if (keyCode.equals("4")) { // 4. 삭제
				List<MemberDTO> list = eDao.selectMemberAll();
				for (MemberDTO member : list)
					System.out.println(member.toString());
				System.out.println("삭제할 아이디");
				System.out.print("> ");
				eDao.deleteMember(Integer.parseInt(scanner.nextLine()));
				System.out.println("삭제되었습니다.");
			} else if (keyCode.equals("5")) { // 5. 검색
				System.out.println("검색할 이름을 입력하세요.");
				System.out.print("> ");
				String name = scanner.nextLine();
				System.out.println(eDao.selectMemberName(name).toString());
			} else if (keyCode.equals("6")) { // 6. 로그인
				System.out.println("아이디와 비밀번호를 입력하세요");
				eDao.check(Integer.parseInt(scanner.nextLine()), scanner.nextLine());
			} else if (keyCode.equals("7")) { // 7. 종료
				run = false;
			}
		}
		System.out.println("프로그램 종료");
		scanner.close();

	}
}
