package learnArray.OneDArray.assignment;

import java.util.Scanner;

/**
 * Write a java program of Binary Search of a given Array
 */
public class BinarySearch {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter the array elements in sorted order: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Enter the element to be searched: ");
		int ele = sc.nextInt();
		
		int index = binarySearch(arr, ele);
		
		if (index == -1) {
			System.out.println("The number is not found");
		} else {
			System.out.println("Found at index " + index);
		}
		
		sc.close();
	}
	
	public static int binarySearch(int[] arr, int ele) {
		int low = 0, high = arr.length - 1;
		
		while (low < high) {
			int mid = (low + high) / 2;
			
			if (arr[mid] == ele) return mid;
			else if (ele < arr[mid]) high = mid - 1;
			else low = mid + 1;
		}
		
		return -1;
	}
	
}
