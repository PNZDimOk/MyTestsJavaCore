package multithreading;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchEx {
    static CountDownLatch countDownLatch = new CountDownLatch(3);

    private  static  void marketStaffOnPlace() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("Market staff came to work");
        countDownLatch.countDown();
        System.out.println("countDownLatch="+countDownLatch.getCount());
    }

    private  static  void everythingIsReady() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("every thing Is ready, so lets open market");
        countDownLatch.countDown();
        System.out.println("countDownLatch="+countDownLatch.getCount());
    }

    private  static  void openMarket() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("Market is opened");
        countDownLatch.countDown();
        System.out.println("countDownLatch="+countDownLatch.getCount());
    }
    public static void main(String[] args) throws InterruptedException {
        new Friend("Dmitrii", countDownLatch);
        new Friend("Stepan", countDownLatch);
        new Friend("Sergei", countDownLatch);
        new Friend("Ivan", countDownLatch);
        new Friend("Maria", countDownLatch);
        new Friend("Oleg", countDownLatch);

        marketStaffOnPlace();
        everythingIsReady();
        openMarket();
    }
}
class Friend extends Thread{
    String name;
    private CountDownLatch countDownLatch;
    public  Friend(String name, CountDownLatch countDownLatch){
        this.name=name;
        this.countDownLatch=countDownLatch;
        this.start();
    }
    public void run(){
        try {
            countDownLatch.await();
            System.out.println(name+" started shopping");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
