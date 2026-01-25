package innerClass;

public class College {
	
	static int a = 10;
	
	private static class Student { // static: Can access outer class static members 
		
		public static void m1() {
			System.out.println(a);
		}
		
	}
	
	class Trainer {
		
	}
	
	public static void main(String[] args) {
		Student.m1();
	}

}
