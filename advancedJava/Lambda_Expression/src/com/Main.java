package com;

public class Main {

    public static void main(String[] args) {

        /* If the method is non-argument method and void return type method */
//        Demo demo = () -> { // JVM creates an object of an Anonymous class
//            System.out.println("Implemented by using Lambda Expression");
//        };

//        Demo demo = () -> System.out.println("Implemented by using Lambda Expression");

//        demo.sample();


        /* If the method is single argument method and void return type method */
//        Demo demo = num -> {
//            System.out.println("Implemented by using Lambda Expression");
//            System.out.println("Number: " + num);
//        };
//
//        demo.sample(100);

        /* If the method is more than one argument method and void return type method */
//        Demo demo = (num1, num2) -> {
//            System.out.println("Implemented by using Lambda Expression");
//            System.out.println("Number1: " + num1);
//            System.out.println("Number2: " + num2);
//        };

//        demo.sample(1000, 2000);


        /* If the method is more than one argument method and has a return type */
//        Demo demo = (num1, num2) -> {
//            return num1 + num2;
//        };

        Demo demo = (num1, num2) -> num1 + num2;

        System.out.println(demo.sample(1000, 2000));
    }

}
