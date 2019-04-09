package sec05_3;

import java.util.*;

public class TreeMapExample2 {
	public static void main(String[] args) throws Exception {
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		scores.put(new Integer(87), "홍길동");
		scores.put(new Integer(98), "이동수");
		scores.put(new Integer(75), "박길순");
		scores.put(new Integer(95), "신용권");
		scores.put(new Integer(80), "김자반");
		
		NavigableMap<Integer, String> descendingMap = scores.descendingMap();
		Set<Map.Entry<Integer, String>> descendingEnteySet = descendingMap.entrySet();
		for (Map.Entry<Integer, String> entry : descendingEnteySet) {
			System.out.print(entry.getKey() + "-" + entry.getValue() + " ");
		}
		System.out.println();
		
		NavigableMap<Integer, String> ascendingMap = descendingMap.descendingMap();
		Set<Map.Entry<Integer, String>> ascendingEnteySet = ascendingMap.entrySet();
		for (Map.Entry<Integer, String> entry : ascendingEnteySet) {
			System.out.print(entry.getKey() + "-" + entry.getValue() + " ");
		}
	}
}
