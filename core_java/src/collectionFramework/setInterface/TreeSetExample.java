package collectionFramework.setInterface;

import java.util.*;

public class TreeSetExample {
	
	public static void main(String[] args) {
//		TreeSet set = new TreeSet<>();
//		
//		set.add("abc");
//		set.add("xyz");
//		set.add(99); // Heterogeneous data not allowed as it gives ClassCastException since it can store only homogeneous data.
//		System.out.println(set);
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		// Maintains sorted order
		set.add(80);
		set.add(10);
		set.add(99);
		
		// does not allow null values
		
		System.out.println(set);
	}

}
