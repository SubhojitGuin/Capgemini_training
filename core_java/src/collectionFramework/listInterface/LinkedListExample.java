package collectionFramework.listInterface;

import java.util.*;

public class LinkedListExample {
	
	public static void main(String[] args) {
		// Create a linked list
		List<String> list = new LinkedList<>();
		
		// Add elements (Create)
		list.add("Java");
		list.add("Python");
		list.add("C++");
		
		// Read element by index (Read)
		System.out.println("First element: " + list.get(0));
		
		// Update element (Update)
		list.set(1, "JavaScript");
		
		// Delete element (Delete)
		list.remove("C++");
		list.remove(0);
		
		// Print the updated list
		System.out.println("Updated list: " + list);
	}

}
