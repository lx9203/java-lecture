package ExerciseOC01;

import java.util.*;

public class Sort {

	public static void main(String[] args) throws Exception {
		String names = "이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,이재영,전경헌";
		StringTokenizer st = new StringTokenizer(names, ",");
		StringTokenizer sta = new StringTokenizer(names, ",");
		int countTokens = st.countTokens();
		int countTokensa = sta.countTokens();
		int countKim = 0;
		int countLee = 0;
		int countMan = 0;
		String nameRoom = new String();

		for (int i = 0; i < countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token);

			// 김씨, 이씨 찾기
			if (token.substring(0, 1).equals("김")) {
				countKim++;
			} else if (token.substring(0, 1).equals("이"))
				countLee++;

			// 이재영씨 찾기
			if (token.equals("이재영"))
				countMan++;

		}
		
		// 중복 제거 및 오름차순 정렬
		System.out.println();
		for (int i = 0; i < countTokensa; i++) {
			String token = sta.nextToken();
			if (nameRoom.indexOf(token) == -1) {
				nameRoom += token + ",";
			}
		}
		
		String[] array = nameRoom.split(",");
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));

		System.out.println();
		System.out.println("김씨 성을 가진 사람 수 : " + countKim);
		System.out.println("이씨 성을 가진 사람 수 : " + countLee);
		System.out.println("이름이 '이재영'인 사람의 수 : " + countMan);
	}

}
