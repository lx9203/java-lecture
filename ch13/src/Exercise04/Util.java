package Exercise04;

public class Util {
	public static <K, V> V getValue(Pair<K, V> pair, K k) {
		if(pair.getKey() == k) {
			return pair.getValue();
		} else {
		return null;}
	}
	
}
