package sec05_For;

import sec05.*;

public class Car {
	Tire[] tires = { new HankookTire(), new HankookTire(), new HankookTire(), new HankookTire() };

	void run() {
		for (Tire tire : tires) {
			tire.roll();
		}
	}
}
