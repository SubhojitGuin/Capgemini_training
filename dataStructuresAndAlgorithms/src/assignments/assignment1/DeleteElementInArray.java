package assignments.assignment1;

/*
  Write a program to delete an element from a given position in an array.
 */
public class DeleteElementInArray {

    public static void main(String[] args) {
        DeleteElementInArray obj = new DeleteElementInArray();

        int[] arr = {1, 2, 3, 4, 5};
        int position = 2;

        int[] newArr = obj.deleteElement(arr, position);

        System.out.println("The elements in the array is now:");
        for (int ele: newArr) {
            System.out.println(ele + " ");
        }
    }

    private int[] deleteElement(int[] arr, int position) {
        int n = arr.length;
        int[] newArr = new int[n - 1];

        for (int i = 0; i < position; i++) {
            newArr[i] = arr[i];
        }

        for (int i = position; i < n - 1; i++) {
            newArr[i] = arr[i + 1];
        }

        return newArr;
    }

}
