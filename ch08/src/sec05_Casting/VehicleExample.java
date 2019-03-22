package sec05_Casting;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
//		vehicle.checkFare(); //(x) Vehicle 클래스에는 checkFare()가 없음
		
		Bus bus = (Bus) vehicle; // 강제 변환
		
		bus.run();
		bus.checkfare(); // Bus 클래스에는 checkFare()가 있음
	}

}
