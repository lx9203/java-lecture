package Exercise10;

import java.util.*;

public class TreeSetExample {

	public static void main(String[] Students) {
		TreeSet<Student> treeSet = new TreeSet<Student>();
		treeSet.add(new Student("blue", 96));
		treeSet.add(new Student("hong", 86));
		treeSet.add(new Student("blue", 92));
		
		Student student = treeSet.last();
		System.out.println("최고점수 : " + student.score);
		System.out.println("최고점수를 받은 아이디 : " + student.id);
	}

}
