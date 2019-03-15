package sec03;

public class WhileKeyControlExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while (run) {
			if (keyCode != 13 && keyCode != 10) {
				System.out.println("----------------------------------------------------");
				System.out.println(" 1. 가속 | 2. 급가속 | 3. 감속 | 4. 급감속 |0. 중지 ");
				System.out.println("----------------------------------------------------");
				System.out.print("선택 : ");
			}
			
			keyCode = System.in.read();
			
			if ( keyCode == 49 ) {			// 1번
				speed ++;
				System.out.println("현재속도 = " + speed);
			} else if (keyCode == 50) {		//2번
				speed += 5;
				System.out.println("현재속도 = " + speed);
			} else if (keyCode == 51) {		//3번
				speed --;
				System.out.println("현재속도 = " + speed);
			} else if (keyCode == 52) {		//4번
				speed -= 5;
				System.out.println("현재속도 = " + speed);
			} else if (keyCode == 48) {		//0번
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

}
