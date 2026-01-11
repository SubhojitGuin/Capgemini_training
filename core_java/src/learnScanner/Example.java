package learnScanner;

import java.util.Scanner; // 1st step

public class Example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 2nd step
		
		System.out.println("Enter a number");
		int value = sc.nextInt();
		System.out.println(value);
		
		sc.close();
	}

}
