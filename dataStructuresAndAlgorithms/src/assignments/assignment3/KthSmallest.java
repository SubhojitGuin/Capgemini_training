package assignments.assignment3;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallest {

    public static void main(String[] args) {
        KthSmallest obj = new KthSmallest();
        int[] arr = {1, 3, 1, 2, 9, 6, 4, 5};
        int k = 3;
        int value = obj.getKthSmallest(arr, k);
        System.out.println(value);
    }

    private int getKthSmallest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int num: arr) {
            if (pq.size() < k) {
                pq.offer(num);
            } else if (num < pq.peek()) {
                pq.poll();
                pq.offer(num);
            }
        }

        return pq.peek();
    }

}
