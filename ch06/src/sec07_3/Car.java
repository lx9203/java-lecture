package sec07_3;

public class Car {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;

	public Car() {
	}

	public Car(String model) {
		this.model = model;
	}

	public Car(String model, String color) {
		this.model = model;
		this.color = color;
	}

	// Car(String model, String color, int maxSpeed){
	// this.model = model;
	// this.color = color;
	// this.maxSpeed = maxSpeed;
	// }

	@Override
	public String toString() {
		return "Car [company=" + company + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed + "]";
	}

	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}
