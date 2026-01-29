package collectionFramework.setInterface;

import java.util.*;

public class HashSetExample {
	
	public static void main(String[] args) {
		Set<String> set = new HashSet<>(); // Generic
		
		// Does not maintain insertion order
		set.add("Java");
		set.add("Python");
		set.add("C++");
		set.add("C++"); // Does not add the duplicate elements
		set.add(null); // Allows null values
		// hashset is the fastest set
		
		System.out.println("Set values: " + set);
		
		System.out.println(set.contains("Java"));
		
		set.remove("C++");
		System.out.println("Set values: " + set);
		
		Set set1 = new HashSet(); // Non-Generic OR Heterogeneous data is allowed
		set1.add(1);
		set1.add(true);
		set1.add("hi");
		System.out.println("Set values: " + set1);
	}

}
