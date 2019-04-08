package sec03_3;

public class MyFunctionalInterfaceExample {

	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		fi = (x) -> {
			int result = x * 5;
			System.out.println(result);
		};
		fi.method(2);
		
		fi = (x) -> { System.out.println( x * 5 ); };
		fi.method(2);
		
		fi = x -> System.out.println( x * 5 );
		fi.method(2);
		
		fi = al -> System.out.println( al * 4 );
		fi.method(14);
		
	}

}
