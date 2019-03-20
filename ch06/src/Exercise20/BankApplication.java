package Exercise20;

import java.util.Scanner;

import Exercise.StudentScore;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("------------------------------------------------------");
			System.out.println(" 1.계좌 생성 | 2.계좌 목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("------------------------------------------------------");
			System.out.print("선택>");

			int selectNo = Integer.parseInt(scan.nextLine());

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			} else {
				System.out.println("1~5사이의 숫자만 입력할 수 있습니다.");
			}
		}
		System.out.println("프로그램 종료");
	}

	private static void createAccount() {
		System.out.println("-----------");
		System.out.println(" 계좌 생성");
		System.out.println("-----------");
		String ano;
		String owner;
		int balance;

		System.out.println("계좌번호 : ");
		ano = scan.nextLine();

		System.out.println("계좌주 : ");
		owner = scan.nextLine();

		System.out.println("초기 입금액 : ");
		balance = Integer.parseInt(scan.nextLine());

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = new Account(ano, owner, balance);
				System.out.println("계좌가 생성되었습니다.");
				return;
			}
		}
		System.out.println("더이상 계좌를 생성할 수 없습니다.");
	}

	private static void accountList() {
		System.out.println("------------------------------------------------------");
		System.out.println("                     계좌 목록");
		System.out.println("------------------------------------------------------");
		for (Account account : accountArray) {
			if (account == null)
				break;
			System.out.printf("%10s", account.getAno());
			System.out.printf("%10s", account.getOwner());
			System.out.printf("%,12d\n", account.getBalance());
		}
	}

	private static void deposit() {

	}

	private static void withdraw() {

	}
}
