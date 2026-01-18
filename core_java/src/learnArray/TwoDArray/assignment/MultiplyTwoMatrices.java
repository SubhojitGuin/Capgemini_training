package learnArray.TwoDArray.assignment;

import java.util.Scanner;

/**
 * Write a Java program to multiply two matrices.
 */
public class MultiplyTwoMatrices {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {		
		System.out.println("Enter the details for the 1st array");
		int[][] arr1 = getInputArray();
		
		System.out.println("Enter the details of the 2nd array");
		int[][] arr2 = getInputArray();
		
		if (arr1[0].length != arr2.length) {
			System.out.println("The columns size of arr1 is not same as the row size of arr2. Aborting...");
			return;
		}
		
		int[][] arr3 = multiplyMatrices(arr1, arr2);
		
		System.out.println("The resultant array is");
		printArray(arr3);
	}
	
	private static int[][] multiplyMatrices(int[][] arr1, int[][] arr2) {
		int[][] arr3 = new int[arr1.length][arr2[0].length];
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2[0].length; j++) {
				for (int k = 0; k < arr1[0].length; k++) {
					arr3[i][j] += arr1[i][k] * arr2[k][j];
				}
			}
		}
		
		return arr3;
	}

	public static void printArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
	}
	
	public static int[][] getInputArray() {
		System.out.print("Enter the number of rows of the array: ");
		int rows = sc.nextInt();

		System.out.print("Enter the number of columns of the array: ");
		int cols = sc.nextInt();
		
		int[][] arr = new int[rows][cols];
		
		System.out.println("Enter the elements for the array");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++)
				arr[i][j] = sc.nextInt();
		}
		
		return arr;
	}
	
}
