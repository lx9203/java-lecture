package OC04;

import java.util.*;

public class CountNumber {
	public static void main(String[] args) {
		int[] counts = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

		for (int i=1; i<=9; i++) {
			counts[i]++;
		}
		for (int i=10; i<=99; i++) {
			int firstDigit = i / 10;
			int secondDigit = i % 10;
			counts[firstDigit]++; counts[secondDigit]++;
		}
		for (int i=100; i<=999; i++) {
			int firstDigit = i / 100;
			int secondDigit = (i / 10) % 10;
			int thirdDigit = i % 10;
			counts[firstDigit]++; counts[secondDigit]++; counts[thirdDigit]++;
		}
		counts[1]++; counts[0] += 3; 	// 1000
		
		System.out.println(Arrays.toString(counts));
	}
}
