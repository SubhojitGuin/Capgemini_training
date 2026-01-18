package learnArray.OneDArray.assignment;

import java.util.Scanner;

public class FibonacciElements {
	
	public static void main(String[] args) {
		int[] arr = getInputArray();
		
		boolean found = false;
		System.out.println("The Fibonacci elements are: ");
		for (int num: arr) {
			if (isFibonacci(num)) {
				found = true;
				System.out.print(num + " ");
			}
		}
		
		if (!found) {
			System.out.println("None found");
		}
	}
	
	private static boolean isFibonacci(int num) {
		return isPerfectSquare(5 * num * num + 4) || isPerfectSquare(5 * num * num - 4);
	}

	private static boolean isPerfectSquare(int num) {
		int s = (int) Math.sqrt(num);
		return s * s == num;
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
