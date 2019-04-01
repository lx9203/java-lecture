package selfPrectice;

import java.util.*;

public class Q_4344 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testC = 0;
		int[] scores = new int[1000];
		int count, total, n;
		double avg;
		for (int i = 0; i <= testC; i++) {
			System.out.println("n > ");
			n = scan.nextInt();
			total = 0;
			count = 0;
			for (int j = 0; j < n; j++) {
				System.out.println(scores[j]+" > " );
				scores[j] = scan.nextInt();
				total += scores[j];
			}
			avg = (double) total / n;
			for (int j = 0; j < n; j++) {
				if (scores[j] > avg) {
					count++;
				}
			}
			System.out.printf("%.3f%s\n", count / n * 100);
			System.out.println("%");
		}
	}
}
