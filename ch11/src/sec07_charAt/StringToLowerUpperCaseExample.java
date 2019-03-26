package sec07_charAt;

public class StringToLowerUpperCaseExample {

	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		
		System.out.println(str1.equals(str2));
		
		String lowerStr1 = str1.toLowerCase();		// 전체 소문자로 변환
		String lowerStr2 = str2.toLowerCase();		// 전체 소문자로 변환
		String upperStr3 = str1.toUpperCase();		// 전체 대문자로 변환
		String upperStr4 = str2.toUpperCase();		// 전체 대문자로 변환
		System.out.println(lowerStr1.equals(lowerStr2));
		System.out.println(upperStr3.equals(upperStr4));
		
		System.out.println(str1.equalsIgnoreCase(str2));
				
	}

}
