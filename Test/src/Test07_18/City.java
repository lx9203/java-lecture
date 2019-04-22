package Test07_18;

public class City {
	public static void main(String[] args) {
		CityDAO cDao = new CityDAO();
		
		System.out.println("국내 인구 100만명 이상인 도시");
		System.out.println(String.format("%s %5s %5s %10s  %6s  ","도시ID","도시이름", "국가코드", "시,도 구분","  인구"));
		
		for(CityDTO write : cDao.selectManyPeople()) {
			System.out.println(write.toString());
		}
		
	}
}
