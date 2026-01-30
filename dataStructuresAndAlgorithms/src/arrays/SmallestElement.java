package arrays;

public class SmallestElement {

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, -1, -5, 10};

        SmallestElement obj = new SmallestElement();
        System.out.println(obj.getSmallestElement(arr));
    }

    private int getSmallestElement(int[] arr) {
        int smallest = Integer.MAX_VALUE;

        for (int i: arr) {
            smallest = Math.min(smallest, i);
        }

        return smallest;
    }

}
