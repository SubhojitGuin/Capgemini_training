package collectionFramework.mapInterface;

import java.util.*;

public class HashMapExample {
	
	public static void main(String[] args) {
		HashMap hmap = new HashMap();
		hmap.put("key", "value");
		hmap.put(66, "xyz");
		hmap.put('a', 100);
		hmap.put(66, "abc");
		
		System.out.println(hmap);
		
		Map<Integer, Integer> map = new HashMap<>(); // Generic
		map.put(4, 5);
		map.put(4, 10);
		map.put(6, 8);
		
		System.out.println(map);
		
		System.out.println(map.remove(4, 10));
		System.out.println(map.containsKey(6));
		System.out.println(map.containsValue(8));
		
		Set<Integer> keySet = map.keySet();
		System.out.println("Key set: " + keySet);
		
		Collection<Integer> values = map.values();
		
		System.out.println(values.getClass());
		System.out.println("Values: " + values);
		
		System.out.println(map.get(40));
		System.out.println(map.getOrDefault(10, 0));
	}

}
