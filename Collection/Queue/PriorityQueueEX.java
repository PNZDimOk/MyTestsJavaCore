package Collection.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueEX {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(7);
        priorityQueue.add(3);
        priorityQueue.add(1);
        priorityQueue.add(71);
        priorityQueue.add(5);
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.peek());
    }
}
