package assignments.assignment3;

public class MergeSort {

    static void merge(int[] arr, int l, int m, int r){

        int i1 = l, i2 = m + 1;

        int[] temp = new int[r - l + 1];
        int ptr = 0;

        while (i1 <= m && i2 <= r) {
            if (arr[i1] < arr[i2]) {
                temp[ptr++] = arr[i1++];
            } else {
                temp[ptr++] = arr[i2++];
            }
        }

        while (i1 <= m) {
            temp[ptr++] = arr[i1++];
        }

        while (i2 <= r) {
            temp[ptr++] = arr[i2++];
        }

        for (int i = l; i <= r; i++) {
            arr[i] = temp[i - l];
        }
    }

    static void mergeSort(int[] arr, int l, int r){

        if (l < r) {

            int m = l + (r - l) / 2;

            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }

    public static void main(String[] args){

        int[] arr = {38, 27, 43, 10};

        mergeSort(arr, 0, arr.length - 1);

        for (int i: arr)
            System.out.print(i + " ");
        System.out.println();
    }

}
