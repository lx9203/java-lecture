package Exercise19;

public class Account {
	private static int balance; // 필드

	static final int MIN_BALANCE = 0; // 상수
	static final int MAX_BALANCE = 1000000;

	public static int getBalance() {
		return balance;
	}

	static int value = 0;
	public static void setBalance(int balance) {
		value = balance;
		if (balance <= 0) {
			balance -= value;
		} else if (balance >= 1000000) {
			balance -= value;
		} else
			Account.balance = balance;
	}

}
