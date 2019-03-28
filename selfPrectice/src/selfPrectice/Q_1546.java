package selfPrectice;

import java.util.*;

public class Q_1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("score length >");
		int s = sc.nextInt();
		int[] score = new int[s];
		int i = 0;
		for ( i = 0; i < score.length; ++i) {
			System.out.print("score > ");
			score[i] = sc.nextInt();
		}
		double avg = 0;
		if (s <= 1000 && score[i] <= 100 && score[i] >= 0) {
			
		}

		sc.close();
		System.out.println(avg);
	}

}
