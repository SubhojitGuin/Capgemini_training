package learnArray.OneDArray.assignment;

import java.util.Scanner;

/**
 * Write a java program find Largest Element in a given Array
 */
public class LargestElement {

	public static void main(String[] args) {
		int[] arr = getInputArray();
		
		int largest = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			largest = (largest > arr[i]) ? largest : arr[i];
		}
		
		System.out.println("The largest element is: " + largest);
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
