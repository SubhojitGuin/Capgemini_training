package learnArray.TwoDArray.assignment;

import java.util.Scanner;

/**
 * Write a Java program to count the number of zero elements in a binary matrix.
 */
public class CountZeroesInBinaryMatrix {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[][] arr = getInputArray();
		
		int countZero = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == 0)
					countZero++;
			}
		}
		
		System.out.println("The number of zeroes is " + countZero);
	}
	
	public static int[][] getInputArray() {
		System.out.print("Enter the number of rows of the binary array: ");
		int rows = sc.nextInt();

		System.out.print("Enter the number of columns of the binary array: ");
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
