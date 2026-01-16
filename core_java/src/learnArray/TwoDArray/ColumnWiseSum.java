package learnArray.TwoDArray;

import java.util.Scanner;

public class ColumnWiseSum {
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
		
		int[] columnSum = columnWiseSum(a);
		
		for (int i = 0; i < cols; i++) {
			System.out.println("Col " + i + " = " + columnSum[i]);
		}
	}

	private static int[] columnWiseSum(int[][] arr) {
		int[] colSum = new int[arr[0].length];
		
		for (int i = 0; i < arr[0].length; i++) {
			for (int j = 0; j < arr.length; j++) {
				colSum[i] += arr[j][i];
			}
		}
		
		return colSum;
	}
}
