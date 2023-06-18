package Collection.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeEx {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(5);
        deque.addFirst(7);
        deque.addLast(8);
        deque.offerFirst(100);
        System.out.println(deque);
    }
}
