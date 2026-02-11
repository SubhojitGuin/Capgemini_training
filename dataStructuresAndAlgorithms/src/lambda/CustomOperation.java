package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CustomOperation {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        List<Integer> list = filterOdd(arr);
//        System.out.println(filterOdd(arr));

//        Consumer<Integer> consumer = integer -> System.out.println(integer);
//        list.forEach(consumer);
        list.forEach(System.out::println);
    }

    private static List<Integer> filterOdd(int[] arr) {
        return Arrays.stream(arr).filter(num -> num % 2 == 0).boxed().collect(Collectors.toList());

//        IntPredicate predicate = value -> (value & 1) == 0;
//        return Arrays.stream(arr).filter(predicate).toArray();
//        return Arrays.stream(arr).filter(predicate).boxed().collect(Collectors.toList());
    }

}
