package Exercise;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			int num1 = (int)(Math.random() * 6) + 1;
			int num2 = (int)(Math.random() * 6) + 1;
			int sum = num1 + num2;
			System.out.println("("+ num1 + ", " + num2 + ")");
			if (sum == 5) {
				break;
			}
		}
		System.out.println("합이 5가 나왔습니다.");
		System.out.println("프로그램을 종료합니다.");
	}

}
