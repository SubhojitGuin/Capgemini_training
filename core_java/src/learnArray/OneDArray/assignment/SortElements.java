package learnArray.OneDArray.assignment;

import java.util.Scanner;

/**
 * Write a java program Sort the elements in a given Array (Normal Sorting)
 */
public class SortElements {

	public static void main(String[] args) {
		int[] arr = getInputArray();
		
		mergeSort(arr, 0, arr.length - 1);
		
		System.out.println("The array elements are:");
		printArray(arr);
	}
	
	private static void mergeSort(int[] arr, int start, int end) {
		if (start >= end) return;
		
		int mid = (start + end) / 2;
		mergeSort(arr, start, mid);
		mergeSort(arr, mid + 1, end);
		merge(arr, start, mid, end);
	}

	private static void merge(int[] arr, int start, int mid, int end) {
		int size = end - start + 1;
		int[] temp = new int[size];
		
		int ptr1 = start;
		int ptr2 = mid + 1;
		int k = 0;
		
		while (ptr1 <= mid && ptr2 <= end) {
			if (arr[ptr1] < arr[ptr2]) {
				temp[k++] = arr[ptr1++];
			} else {
				temp[k++] = arr[ptr2++];
			}
		}
		
		while (ptr1 <= mid) {
			temp[k++] = arr[ptr1++];
		}
		
		while (ptr2 <= end) {
			temp[k++] = arr[ptr2++];
		}
		
		for (int i = 0; i < size; i++) {
			arr[start + i] = temp[i];
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
