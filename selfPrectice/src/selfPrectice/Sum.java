package selfPrectice;

import java.util.*;

public class Sum {

	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int n = c.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
}