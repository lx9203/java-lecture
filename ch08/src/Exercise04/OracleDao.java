package Exercise04;

public class OracleDao implements DataAccessObject {



	@Override
	public void select() {
		System.out.println("Oracle Db에서 검색");
	}

	@Override
	public void insert() {
		System.out.println("Oracle Db에 삽입");
	}

	@Override
	public void update() {
		System.out.println("Oracle Db를 수정");
	}

	@Override
	public void delete() {
		System.out.println("Oracle Db에서 삭제");
	}

}
