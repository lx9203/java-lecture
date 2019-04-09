package sec03_1;

import java.util.*;

public class HashSetExample3 {

	public static void main(String[] args) {
		Set<Member2> set = new HashSet<Member2>();
		
		set.add(new Member2("홍길동", 32, "010-1234-1234"));
		set.add(new Member2("홍길동", 58, "010-1234-1234"));
		
		System.out.println("총 객체수 : "+ set.size());
	}

}