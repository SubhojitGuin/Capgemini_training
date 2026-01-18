package learnArray.OneDArray.assignment;

import java.util.Scanner;

/**
 * Write a java program to print First and Last Character of an Array
 */
public class PrintFirstAndLastCharOfArray {
	
	public static void main(String[] args) {
		String[] arr = getInputArray();
		
		for (String str: arr) {
			System.out.print("First Character: " + str.charAt(0));
			System.out.println("\tLast Character: " + str.charAt(str.length() - 1));
		}
	}
	
	public static String[] getInputArray() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();
		
		String[] arr = new String[n];
		
		sc.nextLine();
		System.out.println("Enter the array elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextLine();
		}
		
		sc.close();
		return arr;
	}
}
