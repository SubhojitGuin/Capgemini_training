package learnArray.TwoDArray.assignment;

import java.util.Scanner;

/**
 * Write a Java program to print a matrix in spiral order.
 */
public class PrintMatrixInSpiralOrder {
	
static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[][] arr = getInputArray();	
		printElementsInSpiralManner(arr);
	}

	private static void printElementsInSpiralManner(int[][] arr) {
		int colLeft = 0, colRight = arr[0].length - 1;
		int rowUp = 0, rowDown = arr.length - 1;
		
		while (colLeft <= colRight && rowUp <= rowDown) {
			for (int i = colLeft; i <= colRight; i++) {
				System.out.print(arr[rowUp][i] + " ");
			}
			
			for (int i = rowUp + 1; i <= rowDown; i++) {
				System.out.print(arr[i][colRight] + " ");
			}
			
			if (rowUp == rowDown || colLeft == colRight) break;
			
			for (int i = colRight - 1; i >= colLeft; i--) {
				System.out.print(arr[rowDown][i] + " ");
			}
			
			for (int i = rowDown - 1; i > rowUp; i--) {
				System.out.print(arr[i][colLeft] + " ");
			}
			
			colLeft++;
			colRight--;
			rowUp++;
			rowDown--;
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
