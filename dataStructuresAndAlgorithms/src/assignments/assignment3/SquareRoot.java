package assignments.assignment3;

public class SquareRoot {

    public int findSquareRoot(int num) {
        int low = 1, high = num;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            long sq = (long) mid * mid;
            if (sq == num) return mid;
            else if (sq < num) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return high;
    }

    public static void main(String[] args) {
        SquareRoot obj = new SquareRoot();
        int num = 15;

        System.out.println("The square root of " + num + " is " + obj.findSquareRoot(num));
    }

}
