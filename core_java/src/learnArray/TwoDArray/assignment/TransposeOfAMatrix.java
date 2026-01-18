package learnArray.TwoDArray.assignment;

import java.util.Scanner;

/**
 * Write a Java program to find the transpose of a matrix|
 */
public class TransposeOfAMatrix {

static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {		
		int[][] arr = getInputArray();
		
		int[][] transposeArr = transposeOfMatrix(arr);
		
		System.out.println("The transpose of the array is");
		printArray(transposeArr);
	}
	
	private static int[][] transposeOfMatrix(int[][] arr) {
		int[][] newArr = new int[arr[0].length][arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				newArr[j][i] = arr[i][j];
			}
		}
		
		return newArr;
	}

	public static void printArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
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
