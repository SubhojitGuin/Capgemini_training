package learnArray.TwoDArray.assignment;

import java.util.Scanner;

/**
 * Write a Java program to find the saddle point of a matrix.
 */
public class SaddlePointOfMatrix {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[][] arr = getInputArray();
		
		for (int i = 0; i < arr.length; i++) {
			int minRow = arr[i][0], colIdx = 0;
			
			for (int j = 1; j < arr[i].length; j++) {
				if (minRow > arr[i][j]) {
					minRow = arr[i][j];
					colIdx = j;
				}
			}
			
			int k;
			for (k = 0; k < arr.length; k++) {
				if (arr[k][colIdx] > minRow) {
					break;
				}
			}
			
			if (k == arr.length) {
				System.out.println("The saddle point is " + minRow);
				return;
			}
		}
		
		System.out.println("No Saddle Point exists");
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
