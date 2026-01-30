package arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        ReverseArray obj = new ReverseArray();
        obj.arrayReverse(arr);

        for (int a: arr)
            System.out.println(a);
    }

    public void arrayReverse(int[] arr) {
        int n = (arr.length + 1) / 2;

        for (int i = 0; i < n - 1; i++) {
            arr[i] ^= arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] ^= arr[i];
            arr[i] ^= arr[arr.length - 1 - i];
        }
    }
}
