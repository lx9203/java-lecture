package sec11;

import java.util.Scanner;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "계백");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		System.out.println("변경할 이름을 입력하세요.");
		Scanner scan = new Scanner(System.in);
		p1.name = scan.nextLine();;
		System.out.println("이름이 "+ p1.name +" 로/으로 변경되었습니다.");
		
		scan.close();
	}
}
