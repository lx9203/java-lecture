package sec05_CastingIf;

import sec05_Casting.*;

public class Driver {
	public void drive(Vehicle vehicle) {
		if (vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkfare();
		}
		vehicle.run();
	}
}
