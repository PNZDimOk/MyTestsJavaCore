package Collection.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQEX {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Dmitrii");
        queue.add("Oleg");
        queue.offer("Tatyana");
        queue.add("Maria");
        queue.offer("Misha");
        System.out.println(queue);

        System.out.println(queue.remove());
        System.out.println(queue);
        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());

        System.out.println(queue.element());
        System.out.println(queue.peek());



    }
}
