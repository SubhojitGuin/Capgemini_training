package learnArray.OneDArray.assignment;

import java.util.Scanner;

/**
 * Wap to print product of elements an given Array
 */
public class ProductOfElements {

	public static void main(String[] args) {
		int[] arr = getInputArray();
		
		int prod = 1;
		
		for (int i = 0; i < arr.length; i++) {
			prod *= arr[i];
		}
		
		System.out.println("The product is = " + prod);
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
