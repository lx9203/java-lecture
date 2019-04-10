package Ex16;

import java.util.*;

public class Name {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("강소휘", "이재영", "김연경", "이소영", "양효진", "이재영", "이다영", "양효진", "김수진", "박정아", "이효희", "나현정", "황민경");
		List result = new ArrayList(new HashSet(list));
		System.out.println(list);
		System.out.println(result);
		
	}

}
