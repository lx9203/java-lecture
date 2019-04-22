package Test07_17;

import java.util.*;


public class EaglesApp {

	public static void main(String[] args) {
		EaglesDAO eDao = new EaglesDAO();
		Scanner scanner = new Scanner(System.in);

		System.out.println("1. 선수등록 2. 선수변경");
		
		String keyCode = scanner.nextLine();

		if (keyCode.equals("1")) { // 1. 선수 등록
			eDao.insertEagles(new EaglesDTO(0, "정민철", "투수", "대전고", "우투우타", "", 99, "1999", 270000000));
			System.out.println("등록되었습니다.");
		} else if (keyCode.equals("2")) { // 2. 선수 변경
			List<EaglesDTO> list = eDao.selectPlayersAll();
			for (EaglesDTO eagles : list)
				System.out.println(eagles.toString());
			System.out.println("해당 선수의 no를 입력해주세요");
			int BNo = Integer.parseInt(scanner.nextLine());
			
			EaglesDTO eagles = eDao.selectOne(BNo);
			eagles.setName("박재홍");
			eagles.setPosit("외야수");
			eagles.setHand("우투좌타");
			eagles.setHs("인천고");
			eagles.setBackNo(98);
			eagles.setSalary(300000000);
			eDao.updateEagles(eagles);
			System.out.println("변경되었습니다.");
		}
		scanner.close();
	}
}
