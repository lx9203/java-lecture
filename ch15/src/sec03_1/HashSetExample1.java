package sec03_1;

import java.util.*;

public class HashSetExample1 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();

		set.add("Java");
		set.add("JDBC");
		set.add("Servlet");
		set.add("Java");
		set.add("iBATIS");

		int size = set.size();
		System.out.println("총 객체수 : " + size);

		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		set.remove("JDBC");
		set.remove("iBATIS");

		System.out.println("총 객체수 : " + set.size()); // 저장된 객체 수 얻기

		iterator = set.iterator(); // 반복자 얻기
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}

		set.clear();
		if (set.isEmpty()) {
			System.out.println("비어 있음");
		}
	}
}
