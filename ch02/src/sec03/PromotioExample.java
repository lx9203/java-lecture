package sec03;

public class PromotioExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byteValue = 10;
		int intValue = byteValue;  // int <-- byte
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue;  //int <-- char
		System.out.println("가의 유니코드 = " + intValue);
		
		intValue = 500;
		long longValue = intValue;    // long <-- int
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue;  //double <-- int
		System.out.println(doubleValue);
		
		longValue = 123456789000L;
		float floatValue = longValue;   // long --> float
		System.out.println(floatValue);
		
		doubleValue = longValue;
		System.out.println(doubleValue);
	}

}
