package assignments.assignment3;

public class WaveFormSort {

    public static void main(String[] args) {
        WaveFormSort obj = new WaveFormSort();
        int[] arr = {1, 3, 2, 9, 6, 4, 5};
        obj.sort(arr);
        for (int num: arr) {
            System.out.print(num + " ");
        }
    }

    private void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swapped = true;
                    swap(arr, j, j + 1);
                }
            }

            if (!swapped) break;
        }

        if (n % 2 == 1) n--;
        for (int i = 0; i < n; i+=2) {
            swap(arr, i, i + 1);
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
