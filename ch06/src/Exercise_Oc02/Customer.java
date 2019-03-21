package Exercise_Oc02;

public class Customer {
	private String name;
	private String num;
	private String add;
	
	public Customer(String name, String num, String add) {
		this.name = name;
		this.num = num;
		this.add = add;
	}
	
	public void show() {
		System.out.println(name);
		System.out.println(num);
		System.out.println(add);
	}
}
