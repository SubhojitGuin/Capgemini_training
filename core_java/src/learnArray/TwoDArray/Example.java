package learnArray.TwoDArray;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
//		int[][] a = new int[2][3];
//		
//		a[0][0] = 10;
//		a[0][1] = 20;
//		a[0][2] = 30;
//		a[1][0] = 40;
//		a[1][1] = 50;
//		a[1][2] = 60;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of rows: ");
		int rows = sc.nextInt();
		
		System.out.print("Enter the number of columnss: ");
		int cols = sc.nextInt();
		
		int[][] a = new int[rows][cols];
		
		System.out.println("Enter the array elements:");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) 
				a[i][j] = sc.nextInt();
		}
		
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++)
				System.out.print(a[i][j] + " ");
			System.out.println();
		}
	}

}
