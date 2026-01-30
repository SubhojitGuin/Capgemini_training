package arrays;

public class DeleteElement2D {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4, 5, 6, 7},
                {1, 3, 5, 6}
        };

        int element = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == element) {
                    arr[i][j] = Integer.MIN_VALUE;
                }
            }
        }

        for (int[] ar: arr) {
            for (int e: ar) {
                if (e != Integer.MIN_VALUE)
                    System.out.print(e + " ");
            }
            System.out.println();
        }
    }
}
