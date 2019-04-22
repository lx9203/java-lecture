package basic03;

import java.util.*;

public class EaglesTest {

	public static void main(String[] args) {
		EaglesDAO eDao = new EaglesDAO();

		// update
		// EaglesDTO eagles = eDao.selectOne(10012);
		// System.out.println(eagles.toString());
		// eagles.setHand("우투우타");
		// eagles.setSalary(80000000);
		// eDao.updateEagles(eagles);
		// eagles = eDao.selectOne(10012);
		// System.out.println(eagles.toString());

		// insert
		 eDao.insertEagles(new EaglesDTO(0, "김민하", "외야수", "대전고", "우투우타", "김미나", 4,
		 "1999-01-01", 60000000));

		// selectAll
		List<EaglesDTO> list = eDao.selectPlayersAll();
		for (EaglesDTO eagles : list)
			System.out.println(eagles.toString());

		// delete
		// eDao.deleteEagles(10011);
		// List<EaglesDTO> list = eDao.selectAll();
		// for (EaglesDTO eagle : list)
		// System.out.println(eagle.toString());

		// String posits[] = {"투수", "포수", "좌익수", "외야수"};
		// for (String posit:posits) {
		// List<EaglesDTO> list = eDao.selectPlayersByPosition(posit);
		// System.out.println("포지션이 " + posit + "인 선수 명단");
		// for (EaglesDTO eagle : list)
		// System.out.println(eagle.toString());
		// }

		// int salarys[] = {300000000, 20000000};
		// for (int salary:salarys) {
		// List<EaglesDTO> list = eDao.selectPlayersBySalary(salary);
		// System.out.println("연봉이 " + salary + "이상인 선수 명단");
		// for (EaglesDTO eagle : list)
		// System.out.println(eagle.toString());
		// }

		eDao.close();
	}

}
