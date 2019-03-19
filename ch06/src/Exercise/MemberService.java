package Exercise;

public class MemberService {

	public boolean login(String string, String string2) {
		if (string == "hong") {
			if (string2 == "12345")
		return true;
		}
		return false;
	}

	public void logout(String string) {
		if (string == "hong")
			System.out.println("로그아웃 되었습니다.");
	}
	
	
}
