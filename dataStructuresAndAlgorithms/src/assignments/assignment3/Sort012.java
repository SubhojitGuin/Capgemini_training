package assignments.assignment3;

public class Sort012 {

    public static void main(String[] args) {
        Sort012 obj = new Sort012();

//        int[] arr = {0, 1, 2, 2, 0, 1, 0};
        int[] arr = {2, 0, 1};
        obj.sort(arr);

        for (int num: arr) {
            System.out.print(num + " ");
        }
    }

    private void sort(int[] arr) {
        int zeroP = 0, twoP = arr.length - 1, oneP = 0;

        while (oneP <= twoP) {
            if (arr[oneP] == 0) {
                swap(arr, oneP, zeroP);
                zeroP++;
                oneP++;
            } else if (arr[oneP] == 1) {
                oneP++;
            } else if (arr[oneP] == 2) {
                swap(arr, oneP, twoP);
                twoP--;
            }
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
