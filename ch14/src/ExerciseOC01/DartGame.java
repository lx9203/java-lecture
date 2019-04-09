package ExerciseOC01;

import java.util.*;

public class DartGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("다트점수입력(점수 보너스 옵션)");
		System.out.println();
		System.out.println("첫 번째 점수");
		String a = scanner.nextLine();
		System.out.println("두 번째 점수");
		String b = "1S";
//				scanner.nextLine();
		System.out.println("세 번째 점수");
		String c = "1S";
//				scanner.nextLine();
		
		
		String point = a + b + c;
		double pointA;
		String regEx = "^[0-9][SDT](\\*|#)?[0-9][SDT](\\*|#)?[0-9][SDT](\\*|#)?$";
				
		if (point.matches(regEx)) {
//			double num = Double.valueOf();
			
			if ( a.charAt(1) == 'D' ) {
//				System.out.println(num);
//				pointA = num * num;
//				System.out.println(pointA);
			} else if (a.charAt(1) == 'T') {
//				pointA = Math.pow(num, 3);
//				System.out.println(pointA);
			} 
				
		} else System.out.println("잘못된 입력입니다.");
		scanner.close();
	}
}
