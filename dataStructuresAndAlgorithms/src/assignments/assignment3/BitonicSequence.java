package assignments.assignment3;

public class BitonicSequence {

    public static void main(String[] args) {
        BitonicSequence obj = new BitonicSequence();
        int[] arr = {1, 2, 4, 3};
        System.out.println("Peak element is " + obj.findPeak(arr));
    }

    private int findPeak(int[] arr) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if ((mid == 0 || arr[mid - 1] < arr[mid]) && (mid == arr.length - 1 || arr[mid] > arr[mid + 1])) {
                return arr[mid];
            } else if (mid == 0 || arr[mid - 1] < arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }

}
