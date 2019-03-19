package sec06;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();

		System.out.println("제작 회사 : " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색상 : " + myCar.color);
		System.out.println("최고 속도 : " + myCar.maxSpeed);
		System.out.println("현재 속도 : " + myCar.speed);
		
		myCar.speed = 60;
		System.out.println("수정된 속도 : " + myCar.speed);
//		System.out.println("현재 속도 : " + myCar.getSpeed());
//
//		myCar.setSpeed(60);
//		System.out.println("수정된 속도 : " + myCar.getSpeed());
	}

}
