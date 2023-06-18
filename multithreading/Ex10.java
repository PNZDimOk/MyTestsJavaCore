package multithreading;

public class Ex10 {
    static final Lock lock = new Lock();
     void mobileCall() {
        synchronized (lock) {
            System.out.println("Mobile Call starts");
            System.out.println(this);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Mobile Call ends");
        }
    }
     void skypeCall() {
        synchronized (lock) {
            System.out.println("skype Call starts");
            System.out.println(this);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("skype Call ends");
        }
    }
     void whatsAppCall() {
         synchronized (lock) {
             System.out.println("whatsApp Call starts");
             System.out.println(this);
             try {
                 Thread.sleep(7000);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
             System.out.println("whatsApp Call ends");
         }
     }
         public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableImplMobile());
        Thread thread2 = new Thread(new RunnableImplSkype());
        Thread thread3 = new Thread(new RunnableImplWhatsApp());
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
class RunnableImplMobile implements Runnable{
    public void run(){
        new Ex10().mobileCall();
    }
}
class RunnableImplSkype implements Runnable{
    public void run(){
        new Ex10().skypeCall();
    }
}
class RunnableImplWhatsApp implements Runnable{
    public void run(){
        new Ex10().whatsAppCall();
    }
}
class Lock{}
