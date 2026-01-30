package assignments.assignment1;

/*
Write a Java program to create a 2D array and display it in matrix format.
 */
public class TwoDArrayTraversal {

    public static void main(String[] args) {
        TwoDArrayTraversal obj = new TwoDArrayTraversal();

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6, 7},
                {8, 9, 0}
        };
        System.out.println("The array elements are: ");
        obj.traverseArray(arr);
    }

    private void traverseArray(int[][] arr) {
        for (int[] a: arr) {
            for (int e: a) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }
}
