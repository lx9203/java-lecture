package sec02;

public class Box<T> {			// 제네릭
	private T t;

	public T get() {return t;}

	public void set(T t) {this.t = t;}
	
//public class Box {
//	private Object object;
//	public void set (Object object) {this.object = object;}
//	public Object get() {return object;}
//}
}
