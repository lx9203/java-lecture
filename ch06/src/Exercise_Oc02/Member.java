package Exercise_Oc02;

public class Member {

	public static void main(String[] args) {
		String name = "장충동왕족발";
		String num = "1588-3300";
		String add = "대전광역시 동구 대전역 광장 오른쪽 2번째 벤치";
		int cusnum = 19032101;
		int mile = 0;
		
		MemberShip ms = new MemberShip(name, num, add, cusnum, mile);
		ms.show();
		
		
	}

}
