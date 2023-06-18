package multithreading;

public class WaitNotifyEx {
    public static void main(String[] args) {
        Market market = new Market();
        Producer producer = new Producer(market);
        Customer customer = new Customer(market);
        Thread threadPR = new Thread(producer);
        Thread threadCS = new Thread(customer);
        threadPR.start();
        threadCS.start();
    }
}

class Market{
    private int breadCount =0;

    public synchronized void getBread(){
        System.out.println("Thread Customer Start");
        while (breadCount<1){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        breadCount--;
        System.out.println("Costumer -1 bread");
        System.out.println("Bread count in Market:"+breadCount);
        notify();
    }

    public synchronized void putBread(){
        System.out.println("Thread PRODUCER Start");
        while (breadCount>=5){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } breadCount++;
        System.out.println("Producer +1 bread");
        System.out.println("Bread count in Market:"+breadCount);
        notify();
    }
}
class Producer implements Runnable{
    Market market;
    Producer(Market market){
        this.market=market;
    }
    @Override
    public void run() {
        for (int i = 0; i<20;i++){
            market.putBread();
        }
    }
}

class Customer implements Runnable{
    Market market;
    Customer(Market market){
        this.market=market;
    }
    @Override
    public void run() {
        for (int i = 0; i<20;i++){
            market.getBread();
        }
    }
}
