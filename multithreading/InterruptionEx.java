package multithreading;

public class InterruptionEx {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main Starts");
        InterruptedThread interruptedThread = new InterruptedThread();
        interruptedThread.start();
        Thread.sleep(3000);
//        interruptedThread.stop();
        interruptedThread.interrupt();

//        interruptedThread.join();
        System.out.println("Main ends");
    }
}

class InterruptedThread extends Thread{
    double sqrtSum = 0;
    public void run(){
        for (int i =1; i<1_000_000_000; i++){
            if(isInterrupted()){
                System.out.println("Thread interrupted");
                return;
            }
            sqrtSum+=Math.sqrt(i);
            System.out.println(Math.sqrt(i));
        }
        System.out.println("Sum sqrt="+sqrtSum);
    }
}