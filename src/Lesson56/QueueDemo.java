package Lesson56;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    static void main() {
        Queue<String> queue = new PriorityQueue<>();
        queue.offer("John");
        queue.add("Alice");//not safety
        queue.offer("Charlie");
        System.out.println(queue);
        queue.poll(); //FIFO
        System.out.println(queue);

    }
}
