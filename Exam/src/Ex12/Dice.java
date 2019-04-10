package Ex12;

public class Dice {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < 6; j++) {
				sum = i + j;
				if(sum == 5) {
					System.out.println( i + "+" + j + "=" + sum);
				}
			}
		}
	}

}
