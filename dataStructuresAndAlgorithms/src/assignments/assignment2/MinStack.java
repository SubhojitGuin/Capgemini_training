package assignments.assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Stack;

public class MinStack {
    Stack<List<Integer>> st;

    public MinStack() {
        st = new Stack<>();
    }

    public boolean isEmpty() {
        return st.isEmpty();
    }

    public int getMin() {
        if (st.isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        return st.peek().get(1);
    }

    public void push(int element) {
        int minValue = element;
        if (!st.isEmpty()) {
            minValue = Math.min(minValue, getMin());
        }

        List<Integer> list = new ArrayList<>();
        list.add(element);
        list.add(minValue);

        st.push(list);
    }

    public int pop() {
        int element = peek();
        st.pop();
        return element;
    }

    public int peek() {
        if (st.isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }

        return st.peek().get(0);
    }

}

class MinStackDriver {

    public static void main(String[] args) {
        MinStack stack = new MinStack();

        stack.push(3);
        stack.push(1);
        stack.push(5);
        stack.push(-1);
        stack.push(2);

        while (!stack.isEmpty()) {
            System.out.print("Min value: " + stack.getMin());
            System.out.println("  Value: " + stack.pop());
        }
    }

}