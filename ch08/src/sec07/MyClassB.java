package sec07;

public class MyClassB implements MyInterface {
	@Override
	public void method1() {
		System.out.println("MyClassA-method1() 실행");
	}
	
	@Override
	public void method2() {
		System.out.println("MyClassB-method2() 실행");
	}
}	
