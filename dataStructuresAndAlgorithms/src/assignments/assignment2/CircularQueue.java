package assignments.assignment2;

public class CircularQueue {

    private int[] queue;
    private int capacity;
    private int size;
    private int front;
    private int rear;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        size = 0;
        front = 0;
        rear = -1;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public int enqueue(int element) {
        if (isFull()) {
            throw new RuntimeException("Queue is full");
        }

        rear = (rear + 1) % capacity;
        queue[rear] = element;
        size++;
        return element;
    }

    public int dequeue() {
        int element = peek();
        front = (front + 1) % capacity;
        if (--size == 0) {
            front = 0;
            rear = -1;
        }

        return element;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        return queue[front];
    }

}

class CircularQueueDriver {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(4);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        System.out.println(queue.peek());
        System.out.println(queue.dequeue());

        queue.enqueue(5);

        while (!queue.isEmpty()) {
            System.out.print(queue.dequeue() + " ");
        }
    }
}