package queues;

import java.util.ArrayDeque;
import java.util.Queue;

public class TodoList {

    public static void main(String[] args) {
        Queue<String> todoList = new ArrayDeque<>();

        todoList.add("Complete assignments");
        todoList.add("Read a book");
        todoList.add("Complete notes");

        int count = 0;
        while (!todoList.isEmpty()) {
            System.out.println("Task " + ++count + ": " + todoList.poll() + " is completed");
        }
    }
}
