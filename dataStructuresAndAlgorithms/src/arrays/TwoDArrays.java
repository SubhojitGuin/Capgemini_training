package arrays;

public class TwoDArrays {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3}, //0
                {4, 5, 6, 4, 5, 6}, //1
                {7, 8, 9, 5, 6} //2
        };

        int[][] arr1 = new int[4][];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = new int[]{1, 2, 3};
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

}
