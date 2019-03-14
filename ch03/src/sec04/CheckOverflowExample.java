package sec04;

public class CheckOverflowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {    //여기부터 오버플로우 찾기
			int result = safeAdd(2000000000, 2000000000);
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("오버플로우가 발생하여 정확하게 계산할 수 없음.");
			// TODO: handle exception
		}
	}
		
	public static int safeAdd(int left, int right){
		if ((right>0)) {
			if(left>(Integer.MAX_VALUE - right)) {
				throw new ArithmeticException("오버플로우 발생");
			}
		} else {
			if(left<(Integer.MIN_VALUE - right)) {
				throw new ArithmeticException("오버플로우 발생");
			}
		}
		return left + right;
	}    //여기까지 오버플로우 찾기

}
