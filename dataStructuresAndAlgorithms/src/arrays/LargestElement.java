package arrays;

public class LargestElement {

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, -1, -5, 10};

        LargestElement obj = new LargestElement();
        System.out.println(obj.getLargestElement(arr));
    }

    private int getLargestElement(int[] arr) {
        int largest = Integer.MIN_VALUE;

        for (int i: arr) {
            largest = Math.max(largest, i);
        }

        return largest;
    }

}
