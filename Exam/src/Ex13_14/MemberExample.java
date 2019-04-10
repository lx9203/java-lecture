package Ex13_14;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member("홍길동", "asdf123", "qwer456", 25);
		Member m2 = new Member("홍길동", "asdf123", "qwer456", 26);
		Member m3 = new Member("홍길동", "asdf123", "qwer456", 24);
		Member m4 = new Member("홍길동", "asdf123", "qwer456", 25);
		System.out.println(m1.compareTo(m2));
		System.out.println(m1.compareTo(m3));
		System.out.println(m1.compareTo(m4));

	}

}
