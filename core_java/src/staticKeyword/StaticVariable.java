package staticKeyword;

public class StaticVariable {
	// Only 1 common/same copy is available for all the objects of the classes
	static int a = 10; // static var
	static int b; // Default initialization is done
	static String pm = "modi";
	static String c;

	public static void e1() {
		System.out.println(a); //10
		System.out.println(b); //0
		System.out.println(pm); //modi
		System.out.println(c); //null
	}
	
	public static void e2() {
		int a = 20; // local var
		System.out.println(a); //access local var
		System.out.println(StaticVariable.a); //access static var
		
		StaticVariable obj = new StaticVariable();
		System.out.println(obj.a); // access static var using object ref (not recommended)
	}
	
	public static void e3() {
		System.out.println(Student.name); //diff class
	}
	
	public static void main(String[] args) {
//		e1();
//		e2();
//		e3();
		StaticVariable.e3();
	}

}
