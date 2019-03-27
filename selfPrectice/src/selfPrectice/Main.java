package selfPrectice;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int a = c.nextInt();
		if (a < 100000) {
			for (int i = 1; i <= a; i++) {
				System.out.println(i);
			}
		}
	}
}
