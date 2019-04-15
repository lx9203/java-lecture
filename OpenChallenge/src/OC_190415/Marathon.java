package OC_190415;

import java.util.*;

public class Marathon {

	public static void main(String[] args) throws Exception {
		String[] participants  = { "홍길동", "김성현", "김홍길", "임규태", "홍길동", "이준용", "홍길동", "민병대" };
		String[] completioners = { "홍길동", "김성현", "김홍길", "임규태", "이준용", "홍길동", "민병대" };
		int i = 0;

		// 미완주자
		List<String> list = new ArrayList<String>();
		for (i = 0; i < participants.length; i++) {
			list.add(participants[i]);
		}
		System.out.println(list);

		List<String> list2 = new ArrayList<String>();
		for (i = 0; i < completioners.length; i++) {
			list2.add(completioners[i]);
		}
		System.out.println(list2);
		
		System.out.println(findPerson(list, list2));
	}
	
	static String findPerson(List<String> participants, List<String> completioners) {
		for (String name: completioners)
			participants.remove(name);
		return participants.get(0);
	}
}
