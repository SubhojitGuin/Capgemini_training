package assignments.assignment1;

/*
Write a Java program to create a 1D array and traverse its elements.
 */
public class OneDArrayTraversal {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        OneDArrayTraversal obj = new OneDArrayTraversal();
        System.out.println("The array elements are: ");
        obj.traverseArray(arr);
    }

    private void traverseArray(int[] arr) {
        for (int i: arr) {
            System.out.print(i + " ");
        }
    }
}
