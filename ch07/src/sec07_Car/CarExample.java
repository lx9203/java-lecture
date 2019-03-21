package sec07_Car;

import sec07_Tire.HankookTire;

public class CarExample {
	public static void main(String[]args) {
		Car car = new Car();
		
		for (int i = 0; i < 5; i++) {
			int porblemLocation = car.run();
			if (porblemLocation != 0) {
				System.out.println(car.tires[porblemLocation-1].location + " HankookTire로 교체");
				car.tires[porblemLocation-1] = new HankookTire(car.tires[porblemLocation-1].location, 15);
			}
			System.out.println("-------------------------------------");
		}
	}
}
