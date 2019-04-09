package sec02_1;

import java.util.*;

public class ArrayAsListExample {
	public static void main(String[] args) {
		List<String>list1 = Arrays.asList("홍길동", "신용권", "김자바");
		for (String name : list1) {
			System.out.println(name);
		}
		
		List<Integer> list2 = Arrays.asList(1, 2, 3);
		for (Integer value : list2) {
			System.out.println(value);
			System.out.println(list1.get(2));
		}
		
		List<Double> list3 = Arrays.asList(1.2, 2.4, 5.7);
		for (Double doubleValue : list3) {
			System.out.println(doubleValue);
		}
		
		
	}
}
