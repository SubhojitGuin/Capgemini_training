package learnArray.OneDArray.assignment;

import java.util.Scanner;

/**
 * Write a java program to print bubble Sort of a given Array
 */
public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = getInputArray();
		
		bubbleSort(arr);
		
		System.out.println("The array elements are:");
		printArray(arr);
	}
	
	private static void bubbleSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
	                arr[j] = arr[j + 1];
	                arr[j + 1] = temp;
				}
			}
		}
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
