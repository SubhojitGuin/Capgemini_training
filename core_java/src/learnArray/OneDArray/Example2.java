package learnArray.OneDArray;

import java.util.Scanner;

public class Example2 {
	public static void takeCharArray() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the char array size: ");
		int n = sc.nextInt();
		
		char[] c = new char[n];
		System.out.println("Enter the elements:");
		for (int i = 0; i < n; i++) {
			c[i] = sc.next().charAt(0);
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println(c[i]);
		}
		
		sc.close();
	}
	
	public static void takeIntArray() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the int array size: ");
		int n = sc.nextInt();
		
		int[] a = new int[n];
		System.out.println("Enter the elements:");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
		
		sc.close();
	}
	
	public static void takeIntArray(int[] a) {
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}
	
	public static void takeBooleanArray() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the boolean array size: ");
		int n = sc.nextInt();
		
		boolean[] b = new boolean[n];
		
		System.out.println("Enter the elements:");
		for (int i = 0; i < n; i++) {
			b[i] = sc.nextBoolean();
		}
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		sc.close();
	}
	
	public static void takeStringArray() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the int array size: ");
		int n = sc.nextInt();
		
		String[] s = new String[n];
		
		sc.nextLine();
		System.out.println("Enter the elements:");
		for (int i = 0; i < n; i++) {
			s[i] = sc.nextLine();
		}
		
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		
		sc.close();
	}
	
	public static void takeStringArray(String[] s) {
		
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		
	}
	
	public static void takeFloatArray() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Float array size: ");
		int n = sc.nextInt();
		
		float[] f = new float[n];
		
		System.out.println("Enter the elements:");
		for (int i = 0; i < n; i++) {
			f[i] = sc.nextFloat();
		}
		
		for (int i = 0; i < f.length; i++) {
			System.out.println(f[i]);
		}
		
		sc.close();
	}
	
	public static int findSum(int[] arr) { // Pass by reference - the array reference is passed
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
//		System.out.println("Sum = " + sum);
		return sum;
	}
	
	public static void main(String[] args) {
//		takeCharArray();
//		takeBooleanArray();
//		takeFloatArray();
//		takeIntArray();
//		takeStringArray();
		
//		int[] a = {1, 2, 3};
//		System.out.println(findSum(a));
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Enter the int array size: ");
//		int n = sc.nextInt();
//		
//		int[] a = new int[n];
//		System.out.println("Enter the elements:");
//		for (int i = 0; i < n; i++) {
//			a[i] = sc.nextInt();
//		}
//		
//		takeIntArray(a);
//		
//		sc.close();
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the String array size: ");
		int n = sc.nextInt();
		
		String[] s = new String[n];
		
		sc.nextLine();
		System.out.println("Enter the elements:");
		for (int i = 0; i < n; i++) {
			s[i] = sc.nextLine();
		}
		
		takeStringArray(s);
		
		sc.close();
	}
}
