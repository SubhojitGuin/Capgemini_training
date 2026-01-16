package learnArray.TwoDArray;

import java.util.Scanner;

public class FindIndexOfEvenElements {
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
		
		printIndexOfEvenElements(a);
	}
	
	public static void printIndexOfEvenElements(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] % 2 == 0) System.out.println("Row = " +  i + ", Col = " + j);
			}
		}
	}
}
