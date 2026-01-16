package learnArray.OneDArray;

import java.util.Scanner;

public class GetEvenElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the array size: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter the elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int[] evenArray = findEvenElements(arr);
		
		System.out.println("The even elements are:");
		for (int i = 0; i < evenArray.length; i++) {
			System.out.print(evenArray[i] + " ");
		}
	}

	public static int[] findEvenElements(int[] arr) {
		int evenCount = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) evenCount++;
		}
		
		int[] evenArr = new int[evenCount];
		
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) evenArr[k++] = arr[i];
		}
		
		return evenArr;
	}

}
