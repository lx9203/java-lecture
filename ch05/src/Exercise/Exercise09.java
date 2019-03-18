package Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("--------------------------------------------------------------");
			System.out.println(" 1. 학생수 | 2. 점수입력 | 3. 점수 리스트 | 4. 분석 | 5. 종료");
			System.out.println("--------------------------------------------------------------");
			System.out.print("선택> ");

			int selectNo = Integer.parseInt(scanner.nextLine());

			if (selectNo == 1) {
				System.out.print("학생수 > ");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new int[studentNum];
			} else if (selectNo == 2) {
				for (int i = 0; i < studentNum; i++) {
					System.out.print("점수 입력 > ");
					scores[i] = Integer.parseInt(scanner.nextLine());
				}
				System.out.println();
			} else if (selectNo == 3) {
				System.out.println("점수 목록");
				System.out.println(Arrays.toString(scores));
			} else if (selectNo == 4) {
				int max = 0;
				for (int i = 0; i < scores.length; i++) {
					if (max < scores[i]) {
						max = scores[i];
					}
				}

				int sum = 0;
				double avg = 0.0;

				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];
				}

				avg = (double)sum / studentNum;

				System.out.println("max : " + max);
				System.out.println("avg : " + avg);

			} else if (selectNo == 5) {
				run = false;
			}

		}

		System.out.println("프로그램 종료");
		scanner.close();
	}

}
