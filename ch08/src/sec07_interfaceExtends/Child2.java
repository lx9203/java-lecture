package sec07_interfaceExtends;

public abstract class Child2 implements ChildInterface2 {
	public static void main(String[] args) {
		ChildInterface2 ci2 = new ChildInterface2() {
			@Override
			public void method1() {
				System.out.println("메소드 1 실행");
			}

			@Override
			public void method3() {
				System.out.println("메소드 3 실행");
			}
		};

		ci2.method1();
		ci2.method2();
		ci2.method3();
	}

}

