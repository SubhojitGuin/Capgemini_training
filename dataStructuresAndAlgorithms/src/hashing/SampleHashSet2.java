package hashing;

import java.util.HashSet;
import java.util.Set;

public class SampleHashSet2 {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        System.out.println(set.contains(1));
        System.out.println(set.contains(10));
        System.out.println(set);
    }

}
