package sec02;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		String data = null;
		System.out.println(data.toString()); 		//객체가 없는데 객체를 사용하려하면 오류
	}

}
