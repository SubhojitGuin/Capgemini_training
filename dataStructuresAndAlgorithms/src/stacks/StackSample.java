package stacks;

import java.util.Stack;


public class StackSample {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack.toString());
        System.out.println(stack.size());

        for (int i = 0; i < stack.size(); i++) {
            System.out.print(stack.get(i) + " ");
        }

        System.out.println();
        for (int i: stack) {
            System.out.print(i + " ");
        }

        System.out.println();
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

//        stack.pop(); Now gives EmptyStackException
    }

}

class CustomNumber<T extends java.lang.Number> { // wildcard example

}