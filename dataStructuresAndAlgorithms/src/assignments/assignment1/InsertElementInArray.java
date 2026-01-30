package assignments.assignment1;

/*
  Write a program to insert an element at a given position in an array.
 */
public class InsertElementInArray {

    public static void main(String[] args) {
        InsertElementInArray obj = new InsertElementInArray();

        int[] arr = {1, 2, 4, 5};
        int element = 7;
        int position = 2;

        int[] newArr = obj.insertElement(arr, element, position);

        System.out.println("The elements in the array is now:");
        for (int ele: newArr) {
            System.out.println(ele + " ");
        }
    }

    private int[] insertElement(int[] arr, int element, int position) {
        int n = arr.length;
        int[] newArr = new int[n + 1];

        for (int i = 0; i < position; i++) {
            newArr[i] = arr[i];
        }

        newArr[position] = element;

        for (int i = position; i < n; i++) {
            newArr[i + 1] = arr[i];
        }

        return newArr;
    }

}
