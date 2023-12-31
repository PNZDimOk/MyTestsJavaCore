package multithreading;

public class Ex8 {
    public static void main(String[] args) {
        MyRunnableUml1 runnable = new MyRunnableUml1();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Counter{
    static int count=0;
}

class MyRunnableUml1 implements Runnable{
    public synchronized void increment(){
        Counter.count++;
        System.out.print(Counter.count+"  ");
    }
    public void run(){
        for (int i =0;i<10;i++){
            increment();
        }

    }
}