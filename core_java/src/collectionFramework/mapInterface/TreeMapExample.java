package collectionFramework.mapInterface;

import java.util.*;

public class TreeMapExample {
	
	public static void main(String[] args) {
		TreeMap<String, Integer> tree = new TreeMap<String, Integer>();
		// Sort based on key
		tree.put("xyz", 20);
		tree.put("abz", 30);
		tree.put("abc", 50);
		
		System.out.println(tree);
	}

}
