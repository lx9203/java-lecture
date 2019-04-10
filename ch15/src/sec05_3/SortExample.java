package sec05_3;

import java.util.*;

public class SortExample {

	public static void main(String[] args) {
		String[] names = {"한나라", "김자반", "최정신", "박주아", "이이이", "최장신", "김자바"};
		
		bubbleSort(names);				// 버블 정렬
		System.out.println("버블정렬 : " + Arrays.toString(names));
		
		Arrays.sort(names);				// 정렬
		System.out.println("일반정렬 : " + Arrays.toString(names));
	}
	
	static void bubbleSort(String[] names) {
		int len = names.length;
		for (int i=0; i < len-1; i++) {
			for (int k=i+1; k<len; k++) {
				//names[i]와 names[k]를 비교하여, 조건에 맞으면 swap 
				if (names[i].compareTo(names[k]) > 0) {
					String name = names[i];
					names[i] = names [k];
					names[k] = name;
				}
			}
		}
	}
}
