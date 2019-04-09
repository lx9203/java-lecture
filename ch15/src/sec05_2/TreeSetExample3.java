package sec05_2;

import java.util.*;

public class TreeSetExample3 {
	public static void main(String[] args) throws Exception {
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("korea");
		treeSet.add("forever");
		treeSet.add("money");
		treeSet.add("human");
		treeSet.add("ever");
		treeSet.add("zoo");
		treeSet.add("base");
		treeSet.add("guess");
		treeSet.add("description");
		treeSet.add("cherry");
		treeSet.add("joke");
		treeSet.add("apple");
		treeSet.add("import");
		treeSet.add("lope");
		
		System.out.println("[c~f 사이의 단어 검색]");
		NavigableSet<String> rangeSet = treeSet.subSet("c", true, "f", false);
		for (String word : rangeSet) {
			System.out.println(word);
		}
	}
}
