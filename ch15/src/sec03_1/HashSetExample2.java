package sec03_1;

import java.util.*;

public class HashSetExample2 {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("홍길동", 32, "010-1234-1234"));
		set.add(new Member("홍길동", 32, "010-0123-0123"));
		
		System.out.println("총 객체수 : "+ set.size());
	}

}
