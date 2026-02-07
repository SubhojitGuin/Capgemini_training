package heap;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class MaxSlidingWindow {

    public static void main(String[] args) {
        MaxSlidingWindow obj = new MaxSlidingWindow();

        int[] arr = {-1, 1, 3, 4, -2, 4, 6, 8};
        int windowSize = 3;
        List<Integer> list = obj.getMaxSlidingWindow(arr, windowSize);
        System.out.println(list);
    }

    private List<Integer> getMaxSlidingWindow(int[] arr, int windowSize) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!deque.isEmpty() && deque.peekFirst() <= i - windowSize) deque.pollFirst();

            while (!deque.isEmpty() && arr[deque.peekLast()] <= arr[i]) {
                deque.pollLast();
            }
            deque.addLast(i);

            if (i >= windowSize - 1) list.add(arr[deque.peekFirst()]);
        }

        return list;
    }

}
