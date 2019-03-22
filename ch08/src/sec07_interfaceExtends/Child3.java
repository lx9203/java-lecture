package sec07_interfaceExtends;

public abstract class Child3 implements ChildInterface1 {
	public static void main(String[] args) {
		ChildInterface3 ci3 = new ChildInterface3() {
			@Override
			public void method1() {
				System.out.println("메소드 1() 실행");
			}
			@Override
			public void method2() {
				System.out.println("메소드 2() 실행");
			}

			@Override
			public void method3() {
				System.out.println("메소드 3() 실행");
			}
		};

		ci3.method1();
		ci3.method2();
		ci3.method3();
	}

}
