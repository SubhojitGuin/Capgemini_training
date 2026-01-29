package collectionFramework.mapInterface;

import java.util.*;

public class LinkedHashMapExample {
	
	public static void main(String[] args) {
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		// Maintains insertion order
		map.put("abs", 10);
		map.put("abc", 10);
		map.put("abd", 10);
		
		System.out.println(map);
	}

}
