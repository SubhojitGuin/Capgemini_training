package queues;

public class CustomQueue {
    private int[] queue;
    private int size;
    private int front;
    private int rear;

    public CustomQueue(int size) {
        this.size = size;
        queue = new int[size];
        front = 0;
        rear = -1;
    }

    public boolean isFull() {
        return rear == size - 1;
    }

    public boolean isEmpty() {
        return front > rear;
    }

    public int size() {
        return rear - front + 1;
    }

    public int enqueue(int element) {
        if (isFull()) {
            throw new RuntimeException("Queue is full");
        }
        return queue[++rear] = element;
    }

    public int dequeue() {
        int element = peek();
        front++;
        return element;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return queue[front];
    }
}

class QueueMain {

    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue(4);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        System.out.println(queue.peek());

        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }
    }

}