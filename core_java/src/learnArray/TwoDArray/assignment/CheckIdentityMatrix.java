package learnArray.TwoDArray.assignment;

import java.util.Scanner;

/**
 * Write a Java program to check whether a given matrix is an identity matrix.
 */
public class CheckIdentityMatrix {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {		
		int[][] arr = getInputArray();
		
		if (isIdentityMatrix(arr)) {
			System.out.println("The given array is an identity matrix");
		} else {
			System.out.println("The given array is not an identity matrix");
		}

	}
	
	private static boolean isIdentityMatrix(int[][] arr) {
		if (arr.length != arr[0].length) return false;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == j) {
					if (arr[i][j] != 1) return false;
				} else if (arr[i][j] != 0) return false;
			}
		}
		
		return true;
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
