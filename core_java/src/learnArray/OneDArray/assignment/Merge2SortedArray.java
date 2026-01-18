package learnArray.OneDArray.assignment;

import java.util.Scanner;

/**
 * Write a java program Merge Two Arrays an Array
 */
public class Merge2SortedArray {

	public static int[] takeInputArr() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the array size: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter the sorted elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr1 = takeInputArr();
		int[] arr2 = takeInputArr();
		
		int[] zigzagArr = mergeSortedArrays(arr1, arr2);
		
		System.out.println("The zigzag array is:");
		for (int i = 0; i < zigzagArr.length; i++) {
			System.out.print(zigzagArr[i] + " ");
		}
	}

	private static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
		int[] mergeArr = new int[arr1.length + arr2.length];
		
		int k = 0, i, j;
		for (i = 0, j = 0; i < arr1.length && j < arr2.length;) {
			if (arr1[i] < arr2[j])
				mergeArr[k++] = arr1[i++];
			else
				mergeArr[k++] = arr2[j++];
		}
		
		while (i < arr1.length) {
			mergeArr[k++] = arr1[i++];	
		}
		
		while (j < arr2.length) {
			mergeArr[k++] = arr2[j++];	
		}
		
		return mergeArr;
	}

}
