package sec04;

public class Box<T> {			// 제네릭
	private T t;

	public T get() {return t;}

	public void set(T t) {this.t = t;}
}
