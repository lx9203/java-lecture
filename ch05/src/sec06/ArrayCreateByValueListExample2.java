package sec06;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores;
		scores = new int[] { 83, 90, 87 };
		int sum1 = 0;
		for (int score1 : scores) {
			sum1 += score1;
		}

		System.out.println("총합 : " + sum1);

		int sum2 = add(new int[] { 83, 90, 87 });
		System.out.println("총합 : " + sum2);
		add2(new int[] { 83, 90, 87 });
		System.out.println();
	}

	public static int add(int[] scores) {
		int sum = 0;
		for (int score : scores) {
			sum += score;
		}

		return sum;
	}

	public static int add2(int[] scores) {
		int sum = 0;
		for (int score : scores) {
			sum += score;
		}
		return sum;
	}
}
