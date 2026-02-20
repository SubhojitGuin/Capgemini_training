package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class LearnFunctionalInterfaces {

    public static void main(String[] args) {
        /* Predicate<T> */
        Predicate<Integer> isEven = number -> number % 2 == 0;
        System.out.println(isEven.test(25));

//        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7));
//        list.stream().filter(num -> num % 2 == 0).forEach(System.out::println);

        /* Function<T, R> */
        Function<Integer, Integer> square = number -> number * number;
        System.out.println(square.apply(5));

//        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7));
//        list.stream().map(num -> num * num).forEach(System.out::println);

        /* Supplier<T> */
        Supplier<Integer> generateRandomNumbers = () -> new Random().nextInt(1000); // generate a number within the limit 1000;
        System.out.println(generateRandomNumbers.get());

//        Stream.generate(Math::random).limit(5).forEach(System.out::println);

        /* Consumer<T> */
        Consumer<Integer> print = n -> System.out.println(n);
        print.accept(5);
    }

}
