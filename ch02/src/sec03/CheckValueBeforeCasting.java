package sec03;

public class CheckValueBeforeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 128;

		if ((i < Byte.MIN_VALUE) || (i > Byte.MAX_VALUE)) { // &&는 and, ||는 or
			System.out.println("byte타입으로 변환할 수 없습니다.");
			System.out.println("값을 다시 확인해 주세요");
		} else {
			byte b = (byte) i;
			System.out.println(b);
		}
		System.out.println(Short.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Float.MIN_VALUE + ", ");
		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.MIN_VALUE + ", ");
		System.out.println(Double.MAX_VALUE);
	}

}
