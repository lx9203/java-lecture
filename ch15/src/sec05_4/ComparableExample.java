package sec05_4;

import java.util.*;

public class ComparableExample {
	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		treeSet.add(new Person("홍길동", 43));
		treeSet.add(new Person("모자바", 31));
		treeSet.add(new Person("감자바", 25));
		treeSet.add(new Person("모자바", 48));
		treeSet.add(new Person("감자바", 34));
		
//		Person p1 = new Person("홍길동", 45);
//		Person p4 = new Person("홍길동", 45);
//		if (p1.equals(p4)) 
//			System.out.println("equals true");
//		System.out.println("p1.hashCode() : " + p1.hashCode());
//		System.out.println("p4.hashCode() : " + p4.hashCode());
		
//		Iterator<Person> iterator = treeSet.iterator();
//		while (iterator.hasNext()) {
//			Person person = iterator.next();
//			System.out.println(person.name + " : " + person.age);
//		}
		
		for (Person person : treeSet) {				// 나이순 정렬
			System.out.println(person.name + " : " + person.age);
		}
	}
}
