package assignments.assignment4;

import java.util.Arrays;

public class ActivitySelection {

    public static void main(String[] args) {
//        int[] start = { 1, 3, 0, 5, 8, 5 };
//        int[] finish = { 2, 4, 6, 7, 9, 9 };

        int[] start = { 10, 12, 20 };
        int[] finish = { 20, 25, 30 };

        ActivitySelection obj = new ActivitySelection();
        System.out.println(obj.activitySelection(start, finish));
    }

    private int activitySelection(int[] start, int[] finish) {
        int[][] activities = new int[start.length][2];

        for (int i = 0; i < start.length; i++) {
            activities[i][0] = start[i];
            activities[i][1] = finish[i];
        }

        Arrays.sort(activities, (arr1, arr2) -> {
            if (arr1[0] == arr2[0])
                return arr1[1] - arr2[1];
            return arr1[0] - arr2[0];
        });

        int endTime = -1, count = 0;
        for (int[] activity: activities) {
            if (activity[0] > endTime) {
                count++;
                endTime = activity[1];
            } else {
                endTime = Math.min(endTime, activity[1]);
            }
        }

        return count;
    }
}
