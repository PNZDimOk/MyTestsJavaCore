package multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerEX {
//    static int counter = 0;
    static AtomicInteger counter = new AtomicInteger(0);
    public static void increment(){
//        counter++;
        counter.incrementAndGet();

    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnableForAtomic());
        Thread thread2 = new Thread(new MyRunnableForAtomic());
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(counter);
    }
}
class MyRunnableForAtomic implements Runnable{
    public void run(){
        for (int i=0; i<1000;i++){
            AtomicIntegerEX.increment();
        }
    }
}
