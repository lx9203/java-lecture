package basic05;

import java.util.*;

public class BbsApplication {

	public static void main(String[] args) {
		BbsDAO eDao = new BbsDAO();
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		boolean login = false;
		int i;
		String p;

//		if (eDao.check(i, p) == true) {
//			System.out.println("아이디와 비밀번호를 입력하세요");
//			System.out.print("아이디 > ");
//			i = Integer.parseInt(scanner.nextLine());
//			System.out.print("비밀번호");
//			p = scanner.nextLine();
//			eDao.check(i, p);

			while (run) {
				System.out.println("┌-------------------------------------------------------------------------------┐");
				System.out.println("| 1. 글쓰기 | 2. 전체조회 | 3. 수정 | 4. 삭제 | 5. 상세조회 | 9. 종료 |");
				System.out.println("└-------------------------------------------------------------------------------┘");
				System.out.print("선택 >");
				//
				String keyCode = scanner.nextLine();
				if (keyCode.equals("1")) { 										// 1. 글쓰기

				} else if (keyCode.equals("2")) { 								// 2. 전체조회
					List<BbsDTO> list = eDao.selectBbsAll();
					for (BbsDTO member : list)
						System.out.println(member.toString());
				} else if (keyCode.equals("3")) { 								// 3. 수정
					// MemberDTO member = eDao.selectMemberOne(100006);
					// System.out.println(member.toString());
					// System.out.println("변경할 패스워드");
					// System.out.print(" > ");
					// member.setPassword(scanner.nextLine());
					// System.out.println("변경할 이름");
					// System.out.print(" > ");
					// member.setName(scanner.nextLine());
					// System.out.println("변경할 생일");
					// System.out.print(" > ");
					// member.setBirthday(scanner.nextLine());
					// System.out.println("변경할 주소");
					// System.out.print(" > ");
					// member.setAddress(scanner.nextLine());
					// eDao.updateMember(member);
					// System.out.println(member.toString());
				} else if (keyCode.equals("4")) {								 // 4. 삭제
					List<BbsDTO> list = eDao.selectBbsAll();
					for (BbsDTO member : list)
						System.out.println(member.toString());
					System.out.println("삭제할 아이디");
					System.out.print("> ");
					eDao.deleteBbs(Integer.parseInt(scanner.nextLine()));
					System.out.println("삭제되었습니다.");
				} else if (keyCode.equals("5")) { 								// 5. 상세조회
					// System.out.println("검색할 이름을 입력하세요.");
					// System.out.print("> ");
					// String name = scanner.nextLine();
					// System.out.println(eDao.selectMemberName(name).toString());
					// } else if (keyCode.equals("6")) { // 6. 로그인
					// System.out.println("아이디와 비밀번호를 입력하세요");
					// eDao.check(Integer.parseInt(scanner.nextLine()), scanner.nextLine());
				} else if (keyCode.equals("9")) { 								// 9. 종료
					run = false;
				}
			} // while
			System.out.println("프로그램 종료");
			scanner.close();
		}

	}
