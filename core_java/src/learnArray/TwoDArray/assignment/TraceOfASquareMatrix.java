package learnArray.TwoDArray.assignment;

import java.util.Scanner;

/**
 * Write a Java program to find the trace of a square matrix.
 */
public class TraceOfASquareMatrix {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[][] arr = getInputArray();
		
		int trace = 0;
		for (int i = 0; i < arr.length; i++) {
			trace += arr[i][i];
		}
		
		System.out.println("The trace of the array is " + trace);
	}

	public static int[][] getInputArray() {
		System.out.print("Enter the side length of the sqaure matrix: ");
		int side = sc.nextInt();

		int[][] arr = new int[side][side];
		
		System.out.println("Enter the elements for the array");
		for (int i = 0; i < side; i++) {
			for (int j = 0; j < side; j++)
				arr[i][j] = sc.nextInt();
		}
		
		return arr;
	}
	
}
