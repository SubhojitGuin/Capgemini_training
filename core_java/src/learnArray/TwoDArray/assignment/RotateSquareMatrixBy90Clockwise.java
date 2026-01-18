package learnArray.TwoDArray.assignment;

import java.util.Scanner;

/**
 * Write a Java program to rotate a square matrix by 90 degrees clockwise.
 */
public class RotateSquareMatrixBy90Clockwise {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[][] arr = getInputArray();
		
		rotateArray(arr);
		
		System.out.println("The rotated array is: ");
		printArray(arr);
	}
	
	private static void rotateArray(int[][] arr) {
		transposeOfMatrix(arr);
		
		for (int i = 0; i < arr.length; i++) {
			reverse1DArray(arr[i]);
		}
	}
	
	private static void transposeOfMatrix(int[][] arr) {		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		
	}
	
	private static void reverse1DArray(int[] arr) {
		int left = 0, right = arr.length - 1;
		
		while (left < right) {
			arr[left] ^= arr[right];
			arr[right] ^= arr[left];
			arr[left] ^= arr[right];
			
			left++;
			right--;
		}
	}

	public static void printArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
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
