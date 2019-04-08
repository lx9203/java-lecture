package Exercise06;

import java.util.function.*;

public class LambdaExample {
	private static Student[] student = { 
			new Student("홍길동", 90, 96),
			new Student("신용권", 95, 93) 
			};

	public static double avg( ToIntFunction<Student> function) {
		int sum = 0;
		for (Student student2 : student) {
			sum += function.applyAsInt(student2);
		}
		double avg = (double) sum / student.length;
		return avg;
	}

	public static void main(String[] args) {
		double englishAvg = avg( s -> s.getEnglishScore());
		System.out.println("영어 평균 점수 : " + englishAvg);
		
		double mathAvg = avg( s -> s.getMathScore());
		System.out.println("수학 평균 점수 : " + mathAvg);
	}

}
