package Exercise04;

public interface DataAccessObject {

	default void select() {
		System.out.print("Db에서 검색");
	}

	default void insert() {
		System.out.print("DB에 삽입");
	}

	default void update() {
		System.out.print("DB를 수정");
	}

	default void delete() {
		System.out.print("DB에서 삭제");
	}

}
