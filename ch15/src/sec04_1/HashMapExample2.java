package sec04_1;

import java.util.*;

public class HashMapExample2 {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		Student s = new Student(201900001, "홍길동");
		
		map.put(new Student(201900001, "홍길동"), 95);
		System.out.println(map.get(new Student(201900001, "홍길동")));
		map.put(s, 90);				// 95위에 덮어씌운다
		
		System.out.println("총 Entry 수 : " + map.size());
		System.out.println(map.get(new Student(201900001, "홍길동")));
		System.out.println(map.get(s));
	}
}
