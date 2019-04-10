package Ex15;

public class CountEight {
	public static void main(String[] args) {
		for (int i = 0; i <= 10000; i++) {
			countEight(i);
		}
		System.out.println("1~10000중 8의 개수 : " + count);
	}
	public static int count = 0;
	public static void countEight(int numString) {
		if (numString % 10 == 8) {
			count++;
		}
		if (numString > 10) {
			countEight(numString / 10);
		}
	}

}
