package learnArray.TwoDArray.assignment;

import java.util.Scanner;

/**
 * Write a Java program to print the main diagonal and secondary diagonal of a matrix.
 */
public class MainAndSecondaryDiagonal {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {		
		int[][] arr = getInputArray();
		
		System.out.println("The main diagonal elements are: ");
		for (int i = 0; i < Math.min(arr.length, arr[0].length); i++) {
			System.out.print(arr[i][i] + " ");
		}
		
		System.out.println("\nThe secondary diagonal elements are: ");
		for (int i = 0; i < Math.min(arr.length, arr[0].length); i++) {
			System.out.print(arr[i][arr[0].length - i - 1] + " ");
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
