package sec06;

import java.util.Scanner;

public class AdvancedForExample {

	public static void main(String[] args) {
		int[] scores = { 0, 0, 0, 0, 0};
		Scanner scanner = new Scanner(System.in);
		
		
		int sum =0;
		for ( int score : scores) {
			sum = sum + score;
		}
		System.out.println("점수 총합 = " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균 = " + avg);
		scanner.close();
	}


}
