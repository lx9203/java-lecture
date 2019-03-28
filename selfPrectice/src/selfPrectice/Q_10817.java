package selfPrectice;

import java.util.*;

public class Q_10817 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c = 0;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		sc.close();
		
		if (a > 0 && b > 0 && c > 0) {
			if (a >= b && a >= c) {
				if (b > c) {
					System.out.println(b);
				} else System.out.println(c);
			} else if (b >= a && b >= c) {
				if (a > c) {
					System.out.println(a);
				} else System.out.println(c);
			} else if (c >= a && c >= b) {
				if (a > b) {
					System.out.println(a);
				} else System.out.println(b);
			}
		}
	}
}
