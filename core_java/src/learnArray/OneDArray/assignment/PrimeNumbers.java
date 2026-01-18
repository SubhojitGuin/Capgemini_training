package learnArray.OneDArray.assignment;

import java.util.Scanner;

/**
 * Write a java program to print prime number in a given Array
 */
public class PrimeNumbers {

	public static void main(String[] args) {
		int[] arr = getInputArray();
		
		System.out.println("The prime numbers are: ");
		for (int i = 0; i < arr.length; i++) {
			if (isPrime(arr[i]))
				System.out.print(arr[i] + " ");
		}
	}
	
	private static boolean isPrime(int num) {
		if (num <= 1) return false;
		
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) return false;
		}
		
		return true;
	}

	public static int[] getInputArray() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter the array elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		return arr;
	}

}
