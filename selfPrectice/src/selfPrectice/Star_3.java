package selfPrectice;

import java.util.*;

public class Star_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); 
		for (int i = 0; i <= a; ++i) {
			for (int j = 1; j <= a - i; ++j) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}