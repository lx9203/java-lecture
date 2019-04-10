package ExerciseOC01;

import java.util.*;

public class CollectionFramework {

	public static void main(String[] args) {
		String names = "이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,이재영,전경헌";
		System.out.println(names);
		StringTokenizer st = new StringTokenizer(names, ",");
		int countTokens = st.countTokens();
		TreeSet<String> name = new TreeSet<String>();
		int countKim = 0, countLee = 0, countMan = 0;

		// 하나씩 잘라 TreeSet (name) 에 입력
		for (int i = 0; i < countTokens; i++) {
			String token = st.nextToken();
			name.add(token);
			// 김, 이, 이재영 찾기
			if (token.charAt(0) == '김') {
				countKim++;
			} 
			if (token.charAt(0) == '이') {
				countLee++;
			} 
			if (token.equals("이재영"))
				countMan++;
		}
		
		// treeSet을 ArrayList에 입력 (자동 중복 제거)
		ArrayList<String> arr = new ArrayList<String>(name);
		System.out.println("중복 제거 후 목록 : " + arr);
		System.out.println("김씨성을 가진 사람 수 : " + countKim);
		System.out.println("이씨성을 가진 사람 수 : " + countLee);
		System.out.println("이름이 '이재영'인 사람 수 : " + countMan);
	}

}
