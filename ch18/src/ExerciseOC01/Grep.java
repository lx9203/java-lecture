package ExerciseOC01;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Grep {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
//		찾을 문자열 : public
//		찾을 파일명 : D:\\seong\\java-lecture\\ch18\\src\\sec05_2_BufferedSubStream\\BufferedReaderExample.java
		System.out.print("찾을 문자열 : ");
		String findWord = ".*"+scanner.nextLine()+".*";
		System.out.print("찾을 파일명 : ");
		String findFile = scanner.nextLine();
		scanner.close();

		int lineNumber = 1;
		try {
			BufferedReader in = new BufferedReader(new FileReader(findFile));

		      while ((findFile = in.readLine()) != null) {
		        if (findFile.matches(findWord))
		          System.out.format("%3d: %s%n", lineNumber, findFile);

		        lineNumber++; 
		      }
		      in.close();
		} catch (IOException e) {
	        System.err.println(e); // 에러가 있다면 메시지 출력
	        System.exit(1);
	    } catch (PatternSyntaxException e) { // 정규식에 에러가 있다면
	        System.err.println(e);
	        System.exit(1);
	    }
	}

}
