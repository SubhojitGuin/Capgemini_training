package assignments.assignment1;

/*
Write a program to rotate the elements of an array to the left by d positions.
 */
public class RotateArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int d = 2;

        RotateArray obj = new RotateArray();
        obj.rotateArr(arr, d);

        for(int e: arr) {
            System.out.print(e + " ");
        }
    }

    private void rotateArr(int[] arr, int d) {
        d %= arr.length;
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, arr.length - d - 1);
        reverse(arr, arr.length - d, arr.length - 1);
    }

    private void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }

}
