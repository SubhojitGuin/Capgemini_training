package learnArray.OneDArray;

import java.util.Scanner;

public class SumOfEvenAndOddElementsArray {
	
	public static void evenOddSum(int[] a) {
		int evenSum = 0;
		int oddSum = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) evenSum += a[i];
			else oddSum += a[i];
		}
		
		System.out.println("Even Sum = " + evenSum);
		System.out.println("Odd Sum = " + oddSum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the int array size: ");
		int n = sc.nextInt();
		
		int[] a = new int[n];
		System.out.println("Enter the elements:");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		evenOddSum(a);
		
		sc.close();
	}

}
