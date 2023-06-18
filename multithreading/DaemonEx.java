package multithreading;

public class DaemonEx {
    public static void main(String[] args) {
        System.out.println("Main Thread starts");
        UserThread userThread = new UserThread();
        DaemonThread daemonThread = new DaemonThread();
        userThread.start();
        daemonThread.setDaemon(true);
        daemonThread.start();
        System.out.println("User Thread is Daemon "+userThread.isDaemon());
        System.out.println("Daemon Thread is Daemon "+daemonThread.isDaemon());

        System.out.println("Main Thread ends");
    }
}

class DaemonThread extends Thread{
    @Override
    public void run() {
        System.out.println("Daemon Thread start");
        for (int i=0;i<1000;i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
        System.out.println("Daemon Thread Ends");
    }
}

class UserThread extends Thread{
    @Override
    public void run() {
        System.out.println("User Thread start");
        for (char i='A';i<'Z';i++){
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
        System.out.println("User Thread Ends");
    }
}
