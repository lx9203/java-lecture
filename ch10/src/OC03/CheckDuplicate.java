package OC03;

import java.util.*;

public class CheckDuplicate {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] numbers = new String[10];
		boolean[] results = new boolean[10];
		
		for (int i=0; i<10; i++) {
			System.out.print("숫자 입력: ");
			String str = scan.nextLine();
			numbers[i] = str;
			if (i != 0) {
				boolean found = false;
				for (int k=0; k<i; k++) {
					if (str.equals(numbers[k])) {
						found = true;
						break;
					}
				}
				results[i] = found ? false : true;
			} else {
				results[0] = true;
			}
		}
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(results));
	}
}
