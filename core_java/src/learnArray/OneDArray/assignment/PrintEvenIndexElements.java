package learnArray.OneDArray.assignment;

import java.util.Scanner;

/**
 * Wap to print even index elements of an Array
 */
public class PrintEvenIndexElements {
	
	public static void main(String[] args) {
		int[] arr = getInputArray();
		
		System.out.println("The array elements are: ");

		for (int i = 0; i < arr.length; i += 2) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static int[] getInputArray() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter the array elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		return arr;
	}
	
}
