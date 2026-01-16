package learnArray.OneDArray;

import java.util.Scanner;

public class ReplaceElementInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the array size: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter the elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Enter the element for replacement: ");
		int element = sc.nextInt();
		
		System.out.print("Enter the index: ");
		int index = sc.nextInt();

		int[] newArr = replaceElementInIndex(arr, element, index);
		
		System.out.println("The elements are:");
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + " ");
		}
		
		sc.close();
	}

	private static int[] replaceElementInIndex(int[] arr, int element, int index) {
		int[] newArr = arr;
		
		newArr[index] = element;
		
		return newArr;
	}
}
