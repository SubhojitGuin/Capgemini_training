package learnString.StringBuilderKeyword;

public class StringBuilderMethods {
	
	public static void main(String[] args) {
		StringBuilder s1 = new StringBuilder("xyz");
		StringBuilder s2 = new StringBuilder("xyz");
		
		System.out.println(s1); // toString() overridden: returns the string value
		System.out.println(s1.toString()); // overridden: returns the string value
		System.out.println(s1.equals(s2)); // false: Since the different blocks of memory are created and equals() compare the addresses
		System.out.println(s1 == s2);// false: Since the different blocks of memory are created
		
		String s = new String(s1); // Convert StringBuilder -> String
		String p = s1.toString();
		StringBuilder sb = new StringBuilder(s); // convert String -> StringBuilder
	}

}
