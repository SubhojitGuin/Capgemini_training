package collectionFramework;

import java.util.*;

public class Driver {
	
	public static void main(String[] args) {
		// generic -> same type element<Datatype>
		// non-generic -> different types of element

		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(10, "abc"));
		list.add(new Student(11, "xyz"));
		Student s1 = new Student(12, "zzz");
		list.add(s1);
		
		System.out.println(list);
		
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i).id);
//			System.out.println(list.get(i).name);
//			System.out.println("--------------");
//		}
		
		for (Student s: list) {
//			System.out.println(s.id);
//			System.out.println(s.name);
			System.out.println(s);
			System.out.println("-------------");
		}
	}

	public static void addExample() {
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("A");
		a1.add("b");
		a1.add("c");
		
		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("D");
		a2.add("E");
		
		a1.addAll(a2); //collection of elements
		System.out.println(a1);

		a1.addAll(1, a2); // index, collection of elements
		System.out.println(a1);
	}

	public static void passingArrayListExample() {
		ArrayList a1 = new ArrayList();
		a1.add("java");
		a1.add(45.8);
		System.out.println("a1 " + a1);
		ArrayList a2 = new ArrayList(30);
		ArrayList a3 = new ArrayList(a1); // Creates a copy of a1
		a3.add(100);
		System.out.println("a3 " + a3);
	}

	public static void nonGenericArrayListExample() {
		//		List a1 = new ArrayList(); // initialCapacity - 10 (default)
				List a1 = new ArrayList(30); // non-generic, initialCapacity is defined
				a1.add("java");
				a1.add(45.8);
				a1.add(true);
				a1.add(20);
				int a = 99;
				a1.add(a); // autoboxing int -> Integer automatically
				a1.add(null);
				a1.add(null);
				a1.add(20);
				
				System.out.println(a1.size());
				System.out.println(a1);
	}

	public static void genericArrayListExample() {
		List<String> a1 = new ArrayList<>(); //generic //upcasting 
		a1.add("java");
		a1.add("sql");
		a1.add("python");
		System.out.println(a1);
		a1.add(1, "scala");
		System.out.println(a1);
		a1.add(4, "ruby");
		
		System.out.println(a1);
		System.out.println(a1.get(0)); // java : get value at index 0
		System.out.println(a1.get(1)); // sql
//		System.out.println(a1.get(4)); // IndexOutOfBoundsException
		
		a1.set(0, "c++"); // replace the value at index 0 with c++
		System.out.println(a1);
		
		a1.remove(2); // remove at index 2
		System.out.println(a1);
		a1.remove("java"); // remove object
		System.out.println(a1);
	}

}
