package learnArray.OneDArray.assignment;

import java.util.Scanner;

/**
 * Write a java program using new Array Reverse of an Array
 */
public class NewReverseArray {
	
	public static void main(String[] args) {
		int[] arr = getInputArray();
		
		int[] newArray = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			newArray[i] = arr[arr.length - 1 - i];
		}
		
		System.out.println("The array elements are: ");
		printArray(newArray);
	}
	
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
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
