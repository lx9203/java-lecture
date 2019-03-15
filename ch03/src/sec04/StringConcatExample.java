package sec04;

public class StringConcatExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "JDK" + 6.0;
		String str2 = str1 + "특징";	//JDK6.0특징
		System.out.println(str2);	
		
		String str3 = "JDK" + 3 + 3.0;	//JDK33.0
		String str4 = 3 + 3.0 + "JDK";	//6.0JDK
		System.out.println(str3);	
		System.out.println(str4);	
	}

}
