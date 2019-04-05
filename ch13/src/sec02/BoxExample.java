package sec02;

public class BoxExample {								// 제네릭
	public static void main(String[] args) {
		Box<String> box1 = new Box<String>();			// String일 경우
		box1.set("hello");
		String str = box1.get();
		
		Box<Integer> box2 = new Box<Integer>();			// Integer일 경우
		box2.set(6);
		int value = box2.get();
	}
	
//public class BoxExample {
//	public static void main(String[] args) {
//		Box box = new Box();
//		box.set("홍길동");								// String -> Object (자동 타입 변환)
//		String name = (String) box.get();				// Object -> String (강제 타입 변환)
//		
//		box.set(new Apple());							//  Apple -> Object (자동 타입 변환)
//		Apple apple = (Apple)Box.get();					// Object ->  Apple (강제 타입 변환)
//	}
//}
}
