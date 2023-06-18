package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bankomat {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        Employee employee1 = new Employee("Dmitrii", lock);
        Employee employee2 = new Employee("Tatyana", lock);
        Employee employee3 = new Employee("Oleg", lock);
        Employee employee4 = new Employee("Nikolay", lock);
        Employee employee5 = new Employee("Maria", lock);

    }
}
class Employee extends Thread{
    String name;
    private Lock lock;
    public Employee(String name, Lock lock){
        this.name = name;
        this.lock = lock;
        this.start();
    }

    @Override
    public void run() {
        try {
            System.out.println(name+" wait... ");
            lock.lock();
            System.out.println(name+" using bankomat");
            Thread.sleep(5000);
            System.out.println(name+" ends using bankomat");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }
}
