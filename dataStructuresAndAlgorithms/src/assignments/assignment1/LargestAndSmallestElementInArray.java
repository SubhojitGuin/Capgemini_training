package assignments.assignment1;

/*
Write a Java program to find the largest and smallest element in an array.
*/
public class LargestAndSmallestElementInArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        LargestAndSmallestElementInArray obj = new LargestAndSmallestElementInArray();

        int[] largeAndSmall = obj.getLargestAndSmallest(arr);
        System.out.println("Largest value: " + largeAndSmall[0]);
        System.out.println("Smallest value: " + largeAndSmall[1]);
    }

    private int[] getLargestAndSmallest(int[] arr) {
        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            smallest = Math.min(smallest, arr[i]);
            largest = Math.max(largest, arr[i]);
        }

        return new int[] {largest, smallest};
    }

}
