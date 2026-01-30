package assignments.assignment2;

import java.util.LinkedList;
import java.util.Queue;

public class TaskScheduler {

    Queue<String> queue;

    public TaskScheduler() {
        queue = new LinkedList<>();
    }

    public boolean hasTasksLeft() {
        return !queue.isEmpty();
    }

    public void addTask(String task) {
        queue.offer(task);
        System.out.println("Task added: " + task);
    }

    public void executeNextTask() {
        if (!hasTasksLeft()) {
            System.out.println("No tasks left");
            return;
        }
        System.out.println("Task executed: " + queue.poll());
    }

}

class TaskDriver {
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();
        scheduler.addTask("Complete Assignments");
        scheduler.addTask("Read a book");
        scheduler.addTask("Learn Java");
        scheduler.addTask("Learn DSA");

        while (scheduler.hasTasksLeft()) {
            scheduler.executeNextTask();
        }

        scheduler.executeNextTask();
    }
}