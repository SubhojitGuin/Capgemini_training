package assignments.assignment3;

import java.util.PriorityQueue;

public class KthLargest {

    public static void main(String[] args) {
        KthLargest obj = new KthLargest();
        int[] arr = {1, 3, 1, 2, 9, 6, 4, 5};
        int k = 3;
        int value = obj.getKthLargest(arr, k);
        System.out.println(value);
    }

    private int getKthLargest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num: arr) {
            if (pq.size() < k) {
                pq.offer(num);
            } else if (num > pq.peek()) {
                pq.poll();
                pq.offer(num);
            }
        }

        return pq.peek();
    }

}
