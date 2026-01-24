package exceptionPackage.in_builtException.unchecked;

public class Demo {
	
	public static void main(String[] args) {
//		arithmeticExceptionExample();
//		stringIndexOutOfBoundsExceptionExample();
//		nullPointerExceptionExample();
	}

	public static void nullPointerExceptionExample() {
		String s = null;
		System.out.println(s.toLowerCase());
	}

	public static void stringIndexOutOfBoundsExceptionExample() {
		String x = "xyz";
		System.out.println(x.charAt(10));
	}

	public static void arithmeticExceptionExample() {
		System.out.println(5 / 0);
	}

}
