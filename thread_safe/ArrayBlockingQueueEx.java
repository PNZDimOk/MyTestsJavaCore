package thread_safe;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueEx {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(4);

        new Thread(()->{
            int i = 0;
            while (true){
                try {
                    queue.put(++i);
                    System.out.println("Producer add: "+i+"   "+queue);

                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();

        new Thread(()->{

            while (true){
                try {
                    Integer j = queue.take();
                    System.out.println("Consumer take: "+j+"  "+queue);

                    Thread.sleep(7000 );
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
