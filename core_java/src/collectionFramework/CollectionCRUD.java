package collectionFramework;

import java.util.*;

public class CollectionCRUD {

	public static void main(String[] args) {
		stackImpl();
	}

	public static void stackImpl() {
		Stack<String> list = new Stack<>();
		
		//create
		list.add("IEM");
		list.add("UEM");
		list.add(1, "College");
		list.push("Heritage");
		
		//read
		System.out.println(list.get(0));
		System.out.println(list);
		
		//update
		list.set(2, "University");
		System.out.println(list);
		
		//delete
		list.remove(1);
		list.remove("UEM");
		System.out.println(list);
		list.pop();
		System.out.println(list);
	}

	public static void vectorImpl() {
		List<String> list = new Vector<>();
		
		//create
		list.add("IEM");
		list.add("UEM");
		list.add(1, "College");
		
		//read
		System.out.println(list.get(0));
		System.out.println(list);
		
		//update
		list.set(2, "University");
		System.out.println(list);
		
		//delete
		list.remove(1);
		list.remove("UEM");
		System.out.println(list);
	}

	public static void linkedListImpl() {
		LinkedList<String> list = new LinkedList<String>();
		
		//create
		list.add("IEM");
		list.add("UEM");
		list.add(1, "College");
		
		//read
		System.out.println(list.get(0));
		System.out.println(list);
		
		//update
		list.set(2, "University");
		System.out.println(list);
		
		//delete
		list.remove(1);
		list.remove("UEM");
		System.out.println(list);
	}
	
}
