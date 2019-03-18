package Exercise;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		boolean run = true;

		int balance = 0;

		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("---------------------------------------");
			System.out.println(" 1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("---------------------------------------");
			System.out.print("선택 >");

			String keyCode = scanner.nextLine();
			if (keyCode.equals("1")) { // 1번
				System.out.print("예금 > ");
				balance += Integer.parseInt(scanner.nextLine());
				System.out.println("잔액 : " + balance);
			} else if (keyCode.equals("2")) { // 2번
				System.out.print("출금 > ");
				int value = Integer.parseInt(scanner.nextLine());
				if(balance >= value ) balance -= value;
				else {
					System.out.println("출금불가");
				}
				System.out.println("잔액 : " + balance);
				
			} else if (keyCode.equals("3")) { // 3번
				System.out.println("잔액 : " + balance);
			} else if (keyCode.equals("4")) { // 4번
				run = false;
			}
		}
		System.out.println("프로그램 종료");
		scanner.close();
	}

}
