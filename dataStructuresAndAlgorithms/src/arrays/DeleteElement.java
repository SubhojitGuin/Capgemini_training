package arrays;

public class DeleteElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        int element = 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                arr[i] = Integer.MIN_VALUE;
            }
        }

        for (int e: arr) {
            if (e != Integer.MIN_VALUE)
                System.out.println(e);
        }
    }
}
