package learnArray.OneDArray.assignment;

import java.util.Scanner;

/**
 * Write a java program of Linear Search of a given Array
 */
public class LinearSearch {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter the array elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Enter the element to be searched: ");
		int ele = sc.nextInt();
		
		int index = linearSearch(arr, ele);
		
		if (index == -1) {
			System.out.println("The number is not found");
		} else {
			System.out.println("Found at index " + index);
		}
		
		sc.close();
	}
	
	public static int linearSearch(int[] arr, int ele) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ele) {
				return i;
			}
		}
		
		return -1;
	}

}
