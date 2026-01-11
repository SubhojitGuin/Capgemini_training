package learnScanner;

import java.util.Scanner;

public class Person {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the weight(kg): ");
		int weight = sc.nextInt();
		
		sc.nextLine();
		System.out.print("Enter the name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter the age: ");
		int age = sc.nextInt();
		
		System.out.print("Enter the phone number: ");
		long ph_number = sc.nextLong();
		
		sc.nextLine();
		System.out.print("Enter the email: ");
		String email = sc.nextLine();
		
		System.out.print("Enter the gender (M/F): ");
		char gender = sc.next().charAt(0);
		
		System.out.print("Enter the marriage status (true/false): ");
		boolean marriage_status = sc.nextBoolean();
		
		System.out.println("Name: " + name);
		System.out.println("Phone number: " + ph_number);
		System.out.println("Gender: " + gender);
		System.out.println("Marriage Status: " + marriage_status);
		System.out.println("Age: " + age);
		System.out.println("Weight: " + weight);
		System.out.println("Emal: " + email);
		
		sc.close();
	}

}
