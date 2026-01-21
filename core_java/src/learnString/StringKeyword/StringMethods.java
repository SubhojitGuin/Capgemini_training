package learnString.StringKeyword;

public class StringMethods {
	
	public static void main(String[] args) {
		stripMethod();
	}

	public static void stripMethod() {
		String s = "    I love   java       ";
		System.out.println(s.strip()); // same as trim()
		System.out.println(s.stripLeading()); // removes starting space
		System.out.println(s.stripTrailing()); // removes ending space
	}

	public static void replaceMethod() {
		String s1 = "hi hi hi students ";
		System.out.println(s1.replace("hi", "bye")); // bye bye bye students 
		System.out.println(s1.replaceAll("hi", "bye")); // bye bye bye students 
		System.out.println(s1.replaceFirst("hi", "bye")); // bye hi hi students 
	}

	public static void isEmptyMethod() {
		String s = " ";
		System.out.println(s.isEmpty()); // false: Checks if it contains something (other than space)
		
		s = "";
		System.out.println(s.isEmpty()); // true
	}
	
	public static void isBlankMethod() {
		String s = " ";
		System.out.println(s.isBlank()); // true: Checks if something exists including space
		
		s = "";
		System.out.println(s.isBlank()); // true
	}

	public static void valueOfMethod() {
		int a = 100;
		String s = String.valueOf(a);
		System.out.println(s);
	}

	public static void endsWithMethod() {
		String s = "helloworld";
		System.out.println(s.endsWith("world")); //true
		System.out.println(s.endsWith("wor")); //false
		System.out.println(s.endsWith("rld")); //true
	}

	public static void startsWithMethod() {
		String s = "helloworld";
		System.out.println(s.startsWith("hello")); //true
		System.out.println(s.startsWith("h")); //true
		System.out.println(s.startsWith("world")); //false
	}

	public static void equalsIgnoreCaseMethod() {
		String s1 = "java";
		String s2 = "JAVA";
		
		System.out.println(s1.equalsIgnoreCase(s2)); // true: checks the content ignoring the case
		System.out.println(s1.equals(s2)); // false
	}

	public static void splitMethod() {
		String s = "i,love,java";
		
		String[] s2 = s.split(","); //provide regex for separation, returns String[] array
		for (String t: s2) {
			System.out.println(t);
		}
	}

	public static void containsMethod() {
		String s = "i love java";
		System.out.println(s.contains("love")); //true
		System.out.println(s.contains("java")); //true
		System.out.println(s.contains("python")); //false
	}
	
	public static void indexOfMethod() {
		String s = "abbcdbe";
		System.out.println(s.indexOf('b')); // 1
		System.out.println(s.indexOf('a')); // 0
		System.out.println(s.indexOf('y')); // -1: character is not present in the string
		
		System.out.println(s.indexOf('b', 3)); // 5: start searching for 'b' from index 3
		
		String s2 = "hii java java hi";
		System.out.println(s2.indexOf("java")); // 4: Returns the 1st occurrence of the string java
		System.out.println(s2.indexOf("java", 5)); // 9: Returns the 1st occurrence of the string java starting from index 5
		System.out.println(s2.indexOf("java", 5, 13)); // 9: Returns the 1st occurrence of the string java starting from index 5, the word has to end before index 13 else returns -1
	}
	
	public static void lastIndexOfMethod() {
		String s = "abbcdbe";
		
		System.out.println(s.lastIndexOf('b')); // 5
		System.out.println(s.lastIndexOf('a')); // 0
		System.out.println(s.lastIndexOf('f')); // -1
		
		String s2 = "hii java java hi";
		System.out.println(s2.lastIndexOf("java")); // 9: returns the last index of java in the string
	}
	
	public static void toCharArrayMethod() {
		String b = "abcde";
		
		// String -> char[]
		char[] c = b.toCharArray();
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		
		// char[] -> String
		String s = new String(c);
		System.out.println(s);
	}

	public static void substringMethod() {
		String b = "abcde"; // a-0, b-1, c-2, d-3, e-4
		System.out.println(b.substring(1)); // bcd
		System.out.println(b.substring(1, 3)); // bc
		System.out.println(b);
	}
	
	public static void trimMethod() { // removes starting and trailing spaces
		String a = "   xyz  abc   ";
		System.out.println(a);
		System.out.println(a.trim());
	}
	
	public static void toUpperAndLowerCase() {
		String a = "xyz";
		String b = "ABC";
		
		String upper = a.toUpperCase();
		System.out.println(upper);
		System.out.println(b.toLowerCase());
	}

	public static void lengthMethod() {
		String s = "abc";
		int l = s.length();
		System.out.println(l); // 3
		System.out.println(s.length()); // 3
	}

	public static void charAtMethod() {
		String s = "abc";
		char c = s.charAt(0); // take index -> char
		System.out.println(c); // a
		System.out.println(s.charAt(1)); // b
		System.out.println(s.charAt(2)); // c
		
		System.out.println(s.charAt(4)); // index >= length, throws StringIndexOutOfBoundsException
	}

	public static void immutableStringObject() {
		String s = "abc";
		s.toUpperCase(); // new block of memory is created in SCP and destroyed after it is de-referred
		s = s.toUpperCase(); // new block of memory is created and the address is assigned to s, old block is destroyed by garbage collector
		System.out.println(s);
	}

}
