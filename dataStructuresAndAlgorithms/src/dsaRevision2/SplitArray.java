package dsaRevision2;

import java.util.Arrays;
import java.util.Scanner;

public class SplitArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findPossibleValuesOfP(arr, x, y));
        sc.close();
    }

    private static int findPossibleValuesOfP(int[] arr, int x, int y) {
        Arrays.sort(arr);
        return arr[y] - arr[y - 1] - 1;
    }

}
