package multithreading;

public class VolotaileEx extends Thread{
volatile boolean b = true;
public void run(){
    long counter = 0;
    while (b){
        counter++;
    }
    System.out.println("Loop is finished, counter="+counter);
}
    public static void main(String[] args) throws InterruptedException {
    VolotaileEx thread = new VolotaileEx();
    thread.start();
    Thread.sleep(3000);
    System.out.println("3 seconds ends");
    thread.b=false;
    thread.join();
    System.out.println("End of program");
    }
}
