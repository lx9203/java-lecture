package sec02_1;

import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");								// String 객체 저장
		
		int size = list.size();							// 저장된 총 객체 수
		System.out.println("총 객체수 : " + size);
		System.out.println(1);
		System.out.println();
		
		String skill = list.get(2);						// 2번 인덱스의 객체 얻기
		System.out.println("2 : " + skill);
		System.out.println(2);
		System.out.println();
		
		for (int i = 0; i < list.size(); i++) {			// 저장된 총 객체 수만큼 루핑
			String str = list.get(i);
			System.out.println(i + " : "+ str);
		}
		System.out.println(3);
		System.out.println();
		
		for (String str : list) {
			System.out.println(str);
		}
		System.out.println(4);
		System.out.println();
		
		list.remove(2);
		System.out.println("2번 인덱스 객체(Database)삭제");
		for (String str : list) {
			System.out.println(str);
		}
		System.out.println();
		list.remove(2);	
		System.out.println("2번 인덱스 객체(Servlet/JSP)삭제");
		for (String str : list) {
			System.out.println(str);
		}
		System.out.println();
		list.remove("iBATIS");
		System.out.println("iBATIS 삭제");
		for (String str : list) {
			System.out.println(str);
		}
		
		for (int i = 0; i < list.size(); i++) {			// 저장된 총 객체 수만큼 루핑
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
	}

}
