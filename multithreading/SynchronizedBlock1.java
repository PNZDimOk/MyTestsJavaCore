package multithreading;

public class SynchronizedBlock1 {
    public static void main(String[] args) {
        MyRunnableUml2 runnableUml2 = new MyRunnableUml2();
        Thread thread1 =new Thread(runnableUml2);
        Thread thread2 =new Thread(runnableUml2);
        Thread thread3 =new Thread(runnableUml2);
        thread1.start();
        thread2.start();
        thread3.start();
    }

}
class Counter2{
    static int count=0;
}

class MyRunnableUml2 implements Runnable{
    private void doWork2(){
        System.out.println("HELP!!!");
    }

    private void doWork1(){
        doWork2();
        synchronized (this){
            Counter2.count++;
            System.out.println(Counter2.count);
        }
    }
    public void run(){
        for (int i =0;i<10;i++){
            doWork1();
        }

    }
}