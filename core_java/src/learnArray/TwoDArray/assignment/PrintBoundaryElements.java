package learnArray.TwoDArray.assignment;

import java.util.Scanner;

/**
 * Write a Java program to print the boundary elements of a matrix.
 */
public class PrintBoundaryElements {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {		
		int[][] arr = getInputArray();
		
		printBoundaryElements(arr);

	}
	
	private static void printBoundaryElements(int[][] arr) {
		System.out.println("The Boudary elements are");
		
		for (int i = 0; i < arr[0].length; i++) {
			System.out.print(arr[0][i] + " ");
		}
		
		if (arr.length > 1) {
			for (int i = 1; i < arr.length; i++) {
				System.out.print(arr[i][arr[0].length - 1] + " ");
			}
			
			if (arr[0].length > 1) {
				for (int i = arr[0].length - 2; i >= 0; i--) {
					System.out.print(arr[arr.length - 1][i] + " ");
				}
				
				for (int i = arr.length - 2; i >= 1; i--) {
					System.out.print(arr[i][0] + " ");
				}
			}
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
