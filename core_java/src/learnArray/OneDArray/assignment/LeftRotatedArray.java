package learnArray.OneDArray.assignment;

import java.util.Scanner;

/**
 * Write a java program to print left rotated Array
 */
public class LeftRotatedArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the array size: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter the elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Enter the amount of right shift: ");
		int shift = sc.nextInt();
		shift %= arr.length;
		
		sc.close();
		
		if (shift > 0) {
			reverseArray(arr, 0, arr.length - 1);
			reverseArray(arr, 0, arr.length - shift - 1);
			reverseArray(arr, arr.length - shift, arr.length - 1);
		}
		
		System.out.println("The array elements are");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void reverseArray(int[] arr, int left, int right) {
		while (left < right) {
			arr[left] ^= arr[right];
			arr[right] ^= arr[left];
			arr[left] ^= arr[right];
			
			left++;
			right--;
		}
	}

}
