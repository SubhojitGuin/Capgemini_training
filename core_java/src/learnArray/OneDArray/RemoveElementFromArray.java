package learnArray.OneDArray;

import java.util.Scanner;

public class RemoveElementFromArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the array size: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter the elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Enter the index: ");
		int index = sc.nextInt();

		int[] newArr = removeElementFromIndex(arr, index);
		
		System.out.println("The elements are:");
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + " ");
		}
		
		sc.close();
	}

	private static int[] removeElementFromIndex(int[] arr, int index) {
		int[] newArr = new int[arr.length - 1];
		
		int i;
		for (i = 0; i < index; i++) {
			newArr[i] = arr[i];
		}
		
		for (; i < newArr.length; i++) {
			newArr[i] = arr[i + 1];
		}
		
		return newArr;
	}
}
