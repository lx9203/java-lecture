package Exercise;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 0; i < 101; i++) {
			if (i%3 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("3의 배수의 합 : " + sum);
	}

}
