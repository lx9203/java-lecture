package OC_190415;

import java.io.*;
import java.util.*;

public class MemberExample {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("c:/Temp/addrInput.txt");
		BufferedReader br = new BufferedReader(fr);
		TreeSet<Member> memberSet = new TreeSet<Member>();
		String line = null;
		
		while ((line = br.readLine()) != null) {
			System.out.println(line);
			Member member = new Member();
			StringTokenizer st = new StringTokenizer(line, ",");
			member.setName(st.nextToken().trim());
			member.setMail(st.nextToken().trim());
			member.setTel(st.nextToken().trim());
			memberSet.add(member);
		}
		System.out.println();
		for (Member member: memberSet)
			System.out.println(member);
		br.close();
		fr.close();
	}
}
