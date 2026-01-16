package learnArray.OneDArray;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the array size: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter the elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			arr[i] = sumOfDigits(arr[i]);
		}
		
		System.out.println("The sum of elements are:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		sc.close();
	}

	private static int sumOfDigits(int num) {
		int sum = 0;
		
		while (num > 0) {
			sum += (num % 10);
			num /= 10;
		}
		
		return sum;
	}

}
