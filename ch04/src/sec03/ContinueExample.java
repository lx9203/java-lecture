package sec03;

public class ContinueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 10; i++) {
			if (i%2 != 0) {		// i%2 == 0 은 짝수 | i%2 != 0 은 홀수
				continue;
			}
			System.out.println(i);
		}
	}

}
