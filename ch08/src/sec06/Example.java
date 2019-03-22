package sec06;

public class Example {
	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();

		InterFaceA ia = impl;
		ia.methodA();
		System.out.println();

		InterFaceB ib = impl;
		ib.methodB();
		System.out.println();

		InterFaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}
}
