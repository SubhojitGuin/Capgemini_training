package collectionFramework.setInterface;

import java.util.*;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>();
		
		// Maintains insertion order
		set.add("Java");
		set.add("Python");
		set.add("C++"); // Does not allow duplicates
		set.add("C++");
		set.add(null); // Allows null values
		
		System.out.println("Set values: " + set);
		
		set.remove("C++");
		System.out.println("Set values: " + set);
		
		System.out.println(set.contains("Python"));
		
		Set set1 = new LinkedHashSet(); // Non-Generic OR Heterogeneous data is allowed
		set1.add(1);
		set1.add(true);
		set1.add("hi");
		System.out.println("Set values: " + set1);
	}

}
