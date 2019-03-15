package sec02;

import java.util.Scanner;

public class SwitchStringExanple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("직급을 입력하세요. > ");
		String position = scan.nextLine();
		
		switch(position) {
		case "부장" :
			System.out.println("700만원");
			break;
		case "과장" :
			System.out.println("500만원");
			break;
		default :
			System.out.println("300만원");
		}
		scan.close();
	}

}
