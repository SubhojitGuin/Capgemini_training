package learnString.StringKeyword;

public class Demo2 {

	public static void main(String[] args) {
		String s1 = new String("XYZ");
		String s2 = "ABC";
		String s3 = "XYZ";
		String s4 = new String("XYZ");
		String s5 = new String("ABC");
		String s6 = "ABC";
		
		System.out.println(s1.equals(s3)); // true: contents are same, String.equals() always compares contents
		System.out.println(s1 == s3); // false: the addresses of s1 and s3 in Heap Area is different
		
		System.out.println(s4.equals(s5)); // false: contents are different
		System.out.println(s4 == s5); // false: the addresses of s4 and s5 in Heap Area is different
		
		System.out.println(s1.equals(s4)); // true: contents are same, String.equals() always compares contents
		System.out.println(s1 == s4); // false: the addresses of s1 and s4 in Heap Area is different
		
		System.out.println(s2.equals(s6)); // true: contents are same, String.equals() always compares contents
		System.out.println(s2 == s6); // true: the addresses of s2 and s6 in String Content Pool (SCP) are same (SCP lies in Heap Area) 
	}
	
}
