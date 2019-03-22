package sec07_interfaceExtends;

public interface ChildInterface2 extends ParentInterface {
	@Override
	public default void method2() {
		System.out.println("메소드 2 실행");
	}

	public void method3();
}
