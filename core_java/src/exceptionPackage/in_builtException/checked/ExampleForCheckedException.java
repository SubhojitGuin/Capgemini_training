package exceptionPackage.in_builtException.checked;

public class ExampleForCheckedException {
	
	public static void main(String[] args) {
		System.out.println("hii");
		
		try {
			System.out.println(7 / 0); // as this is the first exception, it moves to the respective catch block if mentioned, else RuntimeException
			Class.forName("learnArray.OneDArray.student.Student"); 
		} catch (ClassNotFoundException e) {
			System.out.println("class info is wrong");
		} catch (ArithmeticException e) {
			System.out.println("dividing by zero");
		} catch (Exception e) {
			System.out.println("Something went wrong");
		}
		
		System.out.println("bye");
	}

	public static void classNotFoundExceptionExample() {
		System.out.println("hii");
		
		try {
			Class.forName("learnArray.OneDArray.student.Student"); // creates a block of memory of the fully qualified class mentioned in Heap Area but does not return it
		} catch (ClassNotFoundException e) {
			System.out.println("class info is wrong");
		}
		
		System.out.println("bye");
	}

	public static void interruptedExceptionExample() {
		System.out.println("hii");
		
//		Thread.sleep(3000); checked exception --> InterruptedException
		
		try {
			Thread.sleep(3000); // may cause exception, but it needs to be handled as sleep() throws InterruptedException
		} catch (InterruptedException e) {
			System.out.println("sleep method called");
		}
		
		System.out.println("bye");
	}

}
