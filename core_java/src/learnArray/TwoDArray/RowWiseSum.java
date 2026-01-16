package learnArray.TwoDArray;

import java.util.Scanner;

public class RowWiseSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of rows: ");
		int rows = sc.nextInt();
		
		System.out.print("Enter the number of columns: ");
		int cols = sc.nextInt();
		
		int[][] a = new int[rows][cols];
		
		System.out.println("Enter the array elements:");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) 
				a[i][j] = sc.nextInt();
		}
		
		int[] rowSum = rowWiseSum(a);
		
		for (int i = 0; i < rows; i++) {
			System.out.println("Row " + i + " = " + rowSum[i]);
		}
	}

	private static int[] rowWiseSum(int[][] arr) {
		int[] rowSum = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				rowSum[i] += arr[i][j];
			}
		}
		
		return rowSum;
	}
}
