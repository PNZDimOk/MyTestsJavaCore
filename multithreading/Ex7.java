package multithreading;

public class Ex7 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Meth main Start");
        Thread thread = new Thread(new Worker());
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());
        thread.join();
        System.out.println(thread.getState());
        System.out.println("Main ends");
        System.out.println(thread.getState());
    }
}
class Worker implements Runnable{
    @Override
    public void run() {
        System.out.println("work begins");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("works ends");
    }
}
