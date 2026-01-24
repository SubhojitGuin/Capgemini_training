package wrapperClasses;

public class Example {
	
	public static void main(String[] args) {
		wrapperToString();
	}

	public static void wrapperToString() {
		System.out.println(Integer.toString(123));
	}

	public static void parsing() {
		int a = Integer.parseInt("123"); // String -> int
		long b = Long.parseLong("567"); // String -> long
		System.out.println(b);
		
//		Integer.parseInt("132a"); NumberFormatException
		
//		Character.parseChar(); Does Not Exist
	}

	public static void integerWrapper() {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		Integer i = Integer.valueOf("123"); // String -> Wrapper class type
		System.out.println(i + 1);
	}

	public static void booleanWrapper() {
		//		Boolean b = Boolean.valueOf("true"); //true
		//		Boolean b = Boolean.valueOf("TRUE"); //true
				Boolean b = Boolean.valueOf("TRue");
				System.out.println(b);
				Boolean b1 = Boolean.valueOf("xyz"); //false: all values except equalsIgnoreCase "true" or "TRUE", gives false by default
				System.out.println(b1);
	}

	public static void autoBoxingAndAutoUnBoxing() {
		int n = 10;
		Integer i = n; // AutoBoxing
		int n2 = i; // AutoUnBoxing
		
		Integer i2 = 80; // Auto boxing
	}
	
}
