package assignments.assignment3;

import java.util.HashSet;
import java.util.Set;

public class CheckDuplicateInKDistance {

    public static void main(String[] args) {
        CheckDuplicateInKDistance obj = new CheckDuplicateInKDistance();
        int[] arr = {1, 3, 1, 2, 9, 6, 4, 5};
        int k = 3;
        boolean check = obj.check(arr, k);
        if (check)
            System.out.println("Contains duplicate elements in distance k = " + k);
        else
            System.out.println("Does not contain duplicate elements in distance k = " + k);
    }

    private boolean check(int[] arr, int k) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < k; i++) {
            if (set.contains(arr[i])) return true;
            set.add(arr[i]);
        }

        for (int i = k; i < arr.length; i++) {
            set.remove(arr[i - k]);
            if (set.contains(arr[i])) return true;
            set.add(arr[i]);
        }

        return false;
    }
}
