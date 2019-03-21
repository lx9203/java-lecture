package sec08_Animal;

public class Cat extends Animal {
	public Cat() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("냐옹");
	}
}
