package sec07_interfaceExtends;

public abstract class Child1 implements ChildInterface1 {
	public static void main(String[] args) {
		ChildInterface1 ci1 = new ChildInterface1() {
			@Override
			public void method1() {
				System.out.println("메소드 1 실행");
			}

			@Override
			public void method3() {
				System.out.println("메소드 3 실행");
			}
		};

		ci1.method1();
		ci1.method2();
		ci1.method3();
	}

}
