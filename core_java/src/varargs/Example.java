package varargs;

public class Example {
	public static void main(String[] args) {
		// All of them are valid
//		add();
//		add(2, 3);
//		add(2, 3, 4, 5);
		add("Zero");
		add("Two", 2, 3);
		add("Four", 2, 3, 4, 5);
	}
	
	public static void add(int... n) { // Varargs allows n to store 0 or more variables
		int sum = 0;
		
		for (int i: n) { // For-each loop: n should store multiple elements (Collection/Array/Varargs)
			sum += i;
			System.out.print(i + " ");
		}
		
		System.out.println(": " + sum);
	}
	
	public static void add(String s, int... n) { // There can be only 1 varargs and it has to be at the last
		int sum = 0;
		
		System.out.println(n.length); // Varargs internally is an array
		
		for (int i: n) { // For-each loop: n should store multiple elements (Collection/Array/Varargs)
			sum += i;
			System.out.print(i + " ");
		}
		
		System.out.println(": (" + s + ") " + sum);
	}
}
