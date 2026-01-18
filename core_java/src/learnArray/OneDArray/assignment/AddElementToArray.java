package learnArray.OneDArray.assignment;

import java.util.Scanner;

/**
 * Write a java program to print insert an element to the particular index of an Array
 */
public class AddElementToArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the array size: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter the elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Enter the element to be inserted: ");
		int element = sc.nextInt();
		
		System.out.print("Enter the index: ");
		int index = sc.nextInt();

		int[] newArr = addElementToIndex(arr, element, index);
		
		System.out.println("The elements are:");
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + " ");
		}
		
		sc.close();
	}

	private static int[] addElementToIndex(int[] arr, int element, int index) {
		int[] newArr = new int[arr.length + 1];
		
		int i;
		for (i = 0; i < index; i++) {
			newArr[i] = arr[i];
		}
		
		newArr[index] = element;
		
		for (; i < arr.length; i++) {
			newArr[i + 1] = arr[i];
		}
		
		return newArr;
	}
}
