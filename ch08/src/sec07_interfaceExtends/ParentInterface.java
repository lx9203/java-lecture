package sec07_interfaceExtends;

public interface ParentInterface {
	public void method1();

	public default void method2() {
		System.out.println("method2() 실행");
	}
}
