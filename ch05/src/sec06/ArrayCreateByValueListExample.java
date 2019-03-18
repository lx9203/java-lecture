package sec06;

public class ArrayCreateByValueListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = { 83, 90, 87};
		
		System.out.println("score[0] : " + scores[0]);
		System.out.println("score[1] : " + scores[1]);
		System.out.println("score[2] : " + scores[2]);
		
		int sum = 0;
		for (int score : scores ) {
			sum += score;
		}
		
//		for(int i=0; i<scores.length; i++) {
//			sum += score[i];
//		}
		
		System.out.println("총합 : " + sum);
		double avg = (double) sum/3;
		System.out.println("평균 : " + avg);
	}
}
