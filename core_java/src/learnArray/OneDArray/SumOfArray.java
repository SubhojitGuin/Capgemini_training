package learnArray.OneDArray;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the int array size: ");
		int n = sc.nextInt();
		
		int[] a = new int[n];
		System.out.println("Enter the elements:");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += a[i];
		}
		
		System.out.println("Sum = " + sum);
		
		sc.close();
	}

}
