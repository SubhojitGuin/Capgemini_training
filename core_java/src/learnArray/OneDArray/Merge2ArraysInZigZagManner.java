package learnArray.OneDArray;

import java.util.Scanner;

public class Merge2ArraysInZigZagManner {
	
	public static int[] takeInputArr() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the array size: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter the elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr1 = takeInputArr();
		int[] arr2 = takeInputArr();
		
		int[] zigzagArr = getZigZagArr(arr1, arr2);
		
		System.out.println("The zigzag array is:");
		for (int i = 0; i < zigzagArr.length; i++) {
			System.out.print(zigzagArr[i] + " ");
		}
	}
	
	private static int[] getZigZagArr(int[] arr1, int[] arr2) {
		int[] zigzagArr = new int[arr1.length + arr2.length];
		
		int k = 0, i, j;
		for (i = 0, j = 0; i < arr1.length && j < arr2.length; i++, j++) {
			zigzagArr[k++] = arr1[i];			
			zigzagArr[k++] = arr2[j];
		}
		
		while (i < arr1.length) {
			zigzagArr[k++] = arr1[i++];	
		}
		
		while (j < arr2.length) {
			zigzagArr[k++] = arr2[j++];	
		}
		
		return zigzagArr;
	}
}
