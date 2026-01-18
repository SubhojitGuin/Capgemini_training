package learnArray.OneDArray.assignment;

import java.util.Scanner;

/**
 * Write a java program find Second Largest Element in a given Array
 */
public class SecondLargestElement {

	public static void main(String[] args) {
		int[] arr = getInputArray();
		
		int largest = arr[0];
		int secondLargest = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			} else if (arr[i] > secondLargest) {
				secondLargest = arr[i];
			}
		}
		
		System.out.println("The second largest element is: " + secondLargest);
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
