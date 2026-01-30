package assignments.assignment2;

import java.util.ArrayDeque;
import java.util.Deque;

class StackUsingDeque {

    Deque<Integer> deque = new ArrayDeque<>();

    public StackUsingDeque() {
    }

    public boolean isEmpty() {
        return deque.isEmpty();
    }

    public int size() {
        return deque.size();
    }

    public int push(int element) {
        deque.push(element);
        return element;
    }

    public int pop() {
        return deque.pop();
    }

    public int peek() {
        return deque.peek();
    }

}

public class CustomStackUsingDequeDriver {

    public static void main(String[] args) {
        StackUsingDeque stack = new StackUsingDeque();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);


        System.out.println(stack);

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println(stack.size());
    }

}

