package learnArray.OneDArray.assignment;

import java.util.Scanner;

/**
 * Write a java program without using new Array Reverse of an Array
 */
public class ReverseArray {

	public static void main(String[] args) {
		int[] arr = getInputArray();
		
		int left = 0, right = arr.length - 1;
		
		while (left < right) {
			arr[left] ^= arr[right];
			arr[right] ^= arr[left];
			arr[left] ^= arr[right];
			
			left++;
			right--;
		}
		
		printArray(arr);
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
	
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
