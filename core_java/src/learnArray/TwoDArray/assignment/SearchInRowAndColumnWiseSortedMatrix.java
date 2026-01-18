package learnArray.TwoDArray.assignment;

import java.util.Scanner;

/**
 * Write a Java program to search an element in a row-wise and column-wise sorted matrix.
 */
public class SearchInRowAndColumnWiseSortedMatrix {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[][] arr = getInputArray();
		
		System.out.print("Enter the element to be searched: ");
		int ele = sc.nextInt();
		
		int row = 0, col = arr[0].length - 1;
		
		while (row < arr.length && col >= 0) {
			if (arr[row][col] == ele) {
				System.out.println("The element is found at row " + row + " and column " + col);
				return;
			} else if (ele < arr[row][col]) {
				col--;
			} else row++;
		}
		
		System.out.println("The element is not found");
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
