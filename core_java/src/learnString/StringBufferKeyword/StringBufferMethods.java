package learnString.StringBufferKeyword;

public class StringBufferMethods {
	
	public static void main(String[] args) {
		replaceMethod();
	}

	public static void replaceMethod() {
		StringBuffer s = new StringBuffer("abcdef");
		s.replace(0, 2, "hii");
		System.out.println(s);
	}

	public static void deleteMethod() {
		StringBuffer s = new StringBuffer("xyz abc");
		s.delete(0, 2);
		System.out.println(s);
	}

	public static void insertMethod() {
		StringBuffer s1 = new StringBuffer("xyz");
		s1.insert(1, "abc"); // insert abc at index 1
		System.out.println(s1); //xabcyz
	}

	public static void trimToSizeMethod() {
		StringBuffer s = new StringBuffer(5);
		s.trimToSize(); // trims the value to the capacity
		System.out.println(s);
	}

	public static void capacityMethod() {
		StringBuffer s = new StringBuffer();
		System.out.println(s.capacity()); // 16: default capacity of StringBuffer is capacity
	}

	public static void appendMethod() {
		StringBuffer s1 = new StringBuffer("xyz");
		s1.append("java");
		System.out.println(s1);
	}

	public static void reverseMethod() {
		StringBuffer s1 = new StringBuffer("xyz");
		
		s1.reverse(); // It will happen in the same memory block in heap area
		System.out.println(s1);
	}

	public static void mutableObject() {
		StringBuffer s1 = new StringBuffer("xyz");
		StringBuffer s2 = new StringBuffer("xyz");
		
		System.out.println(s1); // toString() overridden: returns the string value
		System.out.println(s1.toString()); // overridden: returns the string value
		System.out.println(s1.equals(s2)); // false: Since the different blocks of memory are created and equals() compare the addresses
		System.out.println(s1 == s2);// false: Since the different blocks of memory are created
		
		String s = new String(s1); // Convert StringBuffer -> String
		String p = s1.toString();
		StringBuffer sb = new StringBuffer(s); // convert String -> StringBuffer
	}

}
