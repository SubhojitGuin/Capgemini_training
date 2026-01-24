package exceptionPackage.errorPackage;

// error examples
public class Driver {
	
	public static void main(String[] args) {
	}

	public static void outOfMemoryErrorExample() { // When Heap Area is full
		String s = "xyz";
		while (true) {
			s += s; // The String Constant Pool gets filled
		}
	}
	
	public static void stackOverflowErrorExample() { // Call stack is full
		System.out.println("hi");
		stackOverflowErrorExample(); //recursion
	}

}
