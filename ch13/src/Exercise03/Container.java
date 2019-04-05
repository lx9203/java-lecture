package Exercise03;

public class Container<K, V> {
	private K Key;
	private V value;
	
	public Container(K key, V value) {
		Key = key;
		this.value = value;
	}

	public Container() {
	}

	public K getKey() {
		return Key;
	}

	public V getValue() {
		return value;
	}

	public void setKey(K key) {
		Key = key;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public void set(String string, int i) {
		
	}
	public void set(String string, String string1) {
		
	}
	
}
