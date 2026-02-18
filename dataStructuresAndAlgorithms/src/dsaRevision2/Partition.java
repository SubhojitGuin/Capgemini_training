package dsaRevision2;

/*
Pratima and her son Pranav went to their garden and plucked the oranges. They got too
many of them. So decided to sell some of them in the market.They decided to partition
the oranges into 2 groups. Pranav took the last orange he plucked, then put all the
oranges smaller than the last orange in hand to bag A and the larger ones into bag B.
Write a program to implement the solution and help Pranav partition the oranges. The
number of oranges say N is given as I/P. Also, the diameters (D) of the oranges
(assuming all the oranges are round/sphere) in mili meters are given.

2<=N<=2000
40<=D<=100
 */

import java.util.Arrays;

public class Partition {

    public static void main(String[] args) {
        int[] oranges = {40, 60, 45, 80, 100, 65};
        int pivotLoc = partitionArray(oranges);

        System.out.println(Arrays.toString(oranges));
        System.out.println(pivotLoc);

        System.out.print("Bag A: ");
        for (int i = 0; i < pivotLoc; i++) System.out.print(oranges[i] + " ");

        System.out.print("\nBag B: ");
        for (int i = pivotLoc; i < oranges.length; i++) System.out.print(oranges[i] + " ");
    }

    private static int partitionArray(int[] oranges) {
        int n = oranges.length;
        int pivot = oranges[n - 1];

        int smallerPtr = -1;
        for (int ptr = 0; ptr < n - 1; ptr++) {
            if (oranges[ptr] < pivot) {
                smallerPtr++;
                swap(oranges, smallerPtr, ptr);
            }
        }

        smallerPtr++;
        swap(oranges, smallerPtr, n - 1);
        return smallerPtr;
    }

    private static void swap(int[] oranges, int smallerPtr, int ptr) {
        int temp = oranges[smallerPtr];
        oranges[smallerPtr] = oranges[ptr];
        oranges[ptr] = temp;
    }

}
