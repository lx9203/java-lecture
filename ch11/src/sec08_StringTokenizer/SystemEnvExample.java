package sec08_StringTokenizer;

import java.util.*;

public class SystemEnvExample {

	public static void main(String[] args) {
		System.out.print("Path : ");
		String home = System.getenv("Path");
		System.out.println(home);
		
		System.out.println();
		
		System.out.println("StringTokenizer를 이용해 ';'로 구분한 Path");
		StringTokenizer st = new StringTokenizer(home,";");
		while( st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}
	

}
