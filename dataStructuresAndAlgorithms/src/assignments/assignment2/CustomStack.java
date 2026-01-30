package assignments.assignment2;

/*
Implement Stack using Array
 */
public class CustomStack {

    private int[] stack;
    private int size;
    private int top;

    public CustomStack(int size) {
        stack = new int[size];
        top = -1;
        this.size = size;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public int size() {
        return top + 1;
    }

    public int push(int element) {
        if (isFull())
            throw new RuntimeException("Stack overflow exception");

        stack[++top] = element;
        return element;
    }

    public int pop() {
        int element = peek();
        top--;
        return element;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack underflow exception");
        }

        return stack[top];
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }

        StringBuilder s = new StringBuilder("[");
        for (int i = 0; i < stack.length; i++) {
            s.append(stack[i]);
            if (i == stack.length - 1) return s.append("]").toString();
            s.append(", ");
        }

        return "";
    }

}

class Controller {

    public static void main(String[] args) {
        CustomStack stack = new CustomStack(4);

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