package learnArray.OneDArray;

import java.util.Scanner;

public class BiggestAndSmallestInArr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the array size: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter the elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int[] bigAndSmall = getBigSmall(arr);
		
		System.out.println("Biggest = " + bigAndSmall[1]);
		System.out.println("Smallest = " + bigAndSmall[0]);
		
		sc.close();
	}

	private static int[] getBigSmall(int[] arr) {
		int smallest = arr[0], biggest = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			smallest = (smallest < arr[i]) ? smallest : arr[i];
			biggest = (biggest > arr[i]) ? biggest : arr[i];
		}
		
		return new int[]{smallest, biggest};
	}
	
	
}
