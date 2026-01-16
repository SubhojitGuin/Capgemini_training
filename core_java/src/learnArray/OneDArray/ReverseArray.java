package learnArray.OneDArray;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the array size: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter the elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		reverseArray(arr);
		
		System.out.println("The elements in reverse are:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		sc.close();
	}

	private static void reverseArray(int[] arr) {
		int ptr_left = 0, ptr_right = arr.length - 1;
		
		while (ptr_left < ptr_right) {
			arr[ptr_left] = arr[ptr_left] ^ arr[ptr_right];
			arr[ptr_right] = arr[ptr_left] ^ arr[ptr_right];
			arr[ptr_left] = arr[ptr_left] ^ arr[ptr_right];
			
//			int temp = arr[ptr_left];
//			arr[ptr_left] = arr[ptr_right];
//			arr[ptr_right] = temp;
			
			ptr_left++;
			ptr_right--;
		}
	}

}
