package sec08_StringTokenizer;

import java.util.*;

public class StringTokenizerExample {

	public static void main(String[] args) {
		String text = "홍길동/이수홍옆에있는박연수";
		
		StringTokenizer st = new StringTokenizer(text,"옆에있는"); // 구분자는 문장을 사용해도 가능하다
		int countTokens = st.countTokens();
		for (int i = 0; i < countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
		System.out.println();
		
		st = new StringTokenizer(text,"/");
		while( st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}

}
