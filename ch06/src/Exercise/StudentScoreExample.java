package Exercise;

import java.util.Scanner;

public class StudentScoreExample {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("이름, 수학점수, 영어점수, 과학점수 순으로 입력해 주세요.");
		
		System.out.println("이름을 입력하세요.");
		String name = scanner.nextLine();	
		
		System.out.println("수학 점수를 입력하세요.");
		int math = Integer.parseInt(scanner.nextLine());	
		
		System.out.println("영어 점수를 입력하세요.");
		int english = Integer.parseInt(scanner.nextLine());	
		
		System.out.println("과학 점수를 입력하세요.");
		int science = Integer.parseInt(scanner.nextLine());	
		
		StudentScore studentScore = new StudentScore(name, math, english, science);
		
		studentScore.avg = studentScore.average();
		System.out.println(studentScore.toString());
		
		scanner.close();
	}

}
