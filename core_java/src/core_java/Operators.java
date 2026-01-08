package core_java;

public class Operators {

	public static void main(String[] args) {
		System.out.println("\n***** Arithmetic Operators *****");
		
		System.out.println("\n1. + operator");
		System.out.println(123 + 456);
		System.out.println("ABC" + "XYZ");
		System.out.println("ABC" + 123);
		System.out.println("ABC" + 123 + "DEF");
		System.out.println(123 + 456 + "ABC");
		
		System.out.println("\n2. - operator");
		System.out.println(123 - 456);
		System.out.println(23.5 - 12);
		
		System.out.println("\n3. / operator");
		System.out.println(40.0 / 9);
		System.out.println(55 / 11);
		
		System.out.println("\n4. % operator");
		System.out.println(45 % 6);
		System.out.println(49 % 7);
		
		System.out.println("\n4. * operator");
		System.out.println(50.0 * 10);
		System.out.println(4 * 12);
		
		
		System.out.println("\n***** Assignment Operators *****");
		int a = 5;
		System.out.println(a);
		// Component Assignment
		a += 5;
		System.out.println(a);
		a -= 5;
		System.out.println(a);
		a *= 5;
		System.out.println(a);
		a /= 5;
		System.out.println(a);
		a %= 5;
		System.out.println(a);
		
		
		System.out.println("\n***** Relational Operators *****");
		System.out.println(3 < 5);
		System.out.println(5 < 3);
		System.out.println(3 > 5);
		System.out.println(5 > 3);
		System.out.println(3 <= 5);
		System.out.println(5 <= 3);
		System.out.println(3 >= 5);
		System.out.println(5 >= 3);
		System.out.println(3 == 5);
		System.out.println(5 == 5);
		System.out.println(3 != 5);
		System.out.println(3 != 3);
		
		
		System.out.println("\n***** Logical Operators *****");
		System.out.println((3 < 5) && (5 > 3));
		System.out.println((3 < 5) && (3 > 5));
		System.out.println((3 > 5) && (3 < 5));
		System.out.println((3 == 5) && (3 > 5));
		
		System.out.println((3 < 5) || (5 > 3));
		System.out.println((3 < 5) || (3 > 5));
		System.out.println((3 > 5) || (3 < 5));
		System.out.println((3 == 5) || (3 > 5));
		
		System.out.println(!(3 < 5));
		System.out.println(!(3 > 5));
	}

}
