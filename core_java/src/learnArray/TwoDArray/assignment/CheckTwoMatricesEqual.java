package learnArray.TwoDArray.assignment;

import java.util.Scanner;

/**
 * Write a Java program to check whether two matrices are equal.
 */
public class CheckTwoMatricesEqual {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Enter the number of rows of the array: ");
		int rows = sc.nextInt();

		System.out.print("Enter the number of columns of the array: ");
		int cols = sc.nextInt();

		System.out.println("Enter the elements for the 1st array");
		int[][] arr1 = getInputArray(rows, cols);

		System.out.println("Enter the elements for the 2nd array");
		int[][] arr2 = getInputArray(rows, cols);
		
		if (isSameArray(arr1, arr2)) {
			System.out.println("The arrays are same");
		} else {
			System.out.println("The arrays are not same");
		}
		
	}
	
	private static boolean isSameArray(int[][] arr1, int[][] arr2) {
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i][j] != arr2[i][j])
					return false;
			}
		}
		
		return true;
	}

	public static void printArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
	}
	
	public static int[][] getInputArray(int rows, int cols) {
		int[][] arr = new int[rows][cols];
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++)
				arr[i][j] = sc.nextInt();
		}
		
		return arr;
	}
	
}
