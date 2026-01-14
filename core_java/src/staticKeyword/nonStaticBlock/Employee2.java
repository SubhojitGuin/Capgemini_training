package staticKeyword.nonStaticBlock;

import java.util.Scanner;

public class Employee2 {
	int id;
	String name;
	double salary;
	
	public void work() {
		System.out.println(name + " is working");
	}
	
	public void printEmployee() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
	}
	
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter the number of objects: ");
			int n = sc.nextInt();

			for (int i = 1; i <= n; i++) {
				System.out.println("\nEmployee " + (i));
				Employee2 e = new Employee2();

				System.out.print("Enter the id: ");
				e.id = sc.nextInt();
				
				sc.nextLine();
				System.out.print("Enter the name: ");
				e.name = sc.nextLine();
				
				System.out.print("Enter the salary: ");
				e.salary = sc.nextDouble();
				System.out.println();

				e.work();
				e.printEmployee();
			}
		}
	}

}
