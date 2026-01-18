package learnArray.TwoDArray.assignment;

import java.util.Scanner;

/**
 * Write a Java program to find the largest and smallest elements in a 2D array.
 */
public class LargestAndSmallestElement {

	public static void main(String[] args) {
		int[][] arr = getInputArray();
		
		int largest = arr[0][0], smallest = arr[0][0];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				largest = Math.max(largest, arr[i][j]);
				smallest = Math.min(smallest, arr[i][j]);
			}
		}
		
		System.out.println("Largest element = " + largest);
		System.out.println("Smallest element = " + smallest);
	}
	
	public static int[][] getInputArray() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of rows of the array: ");
		int rows = sc.nextInt();

		System.out.print("Enter the number of columns of the array: ");
		int cols = sc.nextInt();
		
		int[][] arr = new int[rows][cols];
		
		System.out.println("Enter the array elements: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++)
				arr[i][j] = sc.nextInt();
		}
		
		sc.close();
		return arr;
	}
	
}
